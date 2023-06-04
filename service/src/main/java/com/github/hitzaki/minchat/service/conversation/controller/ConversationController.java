package com.github.hitzaki.minchat.service.conversation.controller;

import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.common.model.SyncReq;
import com.github.hitzaki.minchat.service.conversation.model.DeleteConversationReq;
import com.github.hitzaki.minchat.service.conversation.model.UpdateConversationReq;
import com.github.hitzaki.minchat.service.conversation.service.ConversationService;
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
@RequestMapping("v1/conversation")
public class ConversationController {

    @Autowired
    ConversationService conversationService;

    @RequestMapping("/deleteConversation")
    public ResponseVO deleteConversation(@RequestBody @Validated DeleteConversationReq
                                                     req, Integer appId, String identifier)  {
        req.setAppId(appId);
//        req.setOperater(identifier);
        return conversationService.deleteConversation(req);
    }

    @RequestMapping("/updateConversation")
    public ResponseVO updateConversation(@RequestBody @Validated UpdateConversationReq
                                                 req, Integer appId, String identifier)  {
        req.setAppId(appId);
//        req.setOperater(identifier);
        return conversationService.updateConversation(req);
    }

    @RequestMapping("/syncConversationList")
    public ResponseVO syncFriendShipList(@RequestBody @Validated SyncReq req, Integer appId)  {
        req.setAppId(appId);
        return conversationService.syncConversationSet(req);
    }

}
