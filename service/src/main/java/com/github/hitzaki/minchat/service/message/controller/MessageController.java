package com.github.hitzaki.minchat.service.message.controller;

import com.github.hitzaki.minchat.service.message.service.MessageSyncService;
import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.common.model.SyncReq;
import com.github.hitzaki.minchat.common.model.message.CheckSendMessageReq;
import com.github.hitzaki.minchat.service.message.model.req.SendMessageReq;
import com.github.hitzaki.minchat.service.message.service.P2PMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@RestController
@RequestMapping("v1/message")
public class MessageController {

    @Autowired
    P2PMessageService p2PMessageService;

    @Autowired
    MessageSyncService messageSyncService;

    @RequestMapping("/send")
    public ResponseVO send(@RequestBody @Validated SendMessageReq req, Integer appId)  {
        req.setAppId(appId);
        return ResponseVO.successResponse(p2PMessageService.send(req));
    }

    @RequestMapping("/checkSend")
    public ResponseVO checkSend(@RequestBody @Validated CheckSendMessageReq req)  {
        return p2PMessageService.imServerPermissionCheck(req.getFromId(),req.getToId()
                ,req.getAppId());
    }

    @RequestMapping("/syncOfflineMessage")
    public ResponseVO syncOfflineMessage(@RequestBody
                                             @Validated SyncReq req, Integer appId)  {
        req.setAppId(appId);
        return messageSyncService.syncOfflineMessage(req);
    }

}
