package com.github.hitzaki.minchat.service.user.service;

import com.github.hitzaki.minchat.service.user.model.UserStatusChangeNotifyContent;
import com.github.hitzaki.minchat.service.user.model.req.PullFriendOnlineStatusReq;
import com.github.hitzaki.minchat.service.user.model.req.PullUserOnlineStatusReq;
import com.github.hitzaki.minchat.service.user.model.req.SetUserCustomerStatusReq;
import com.github.hitzaki.minchat.service.user.model.req.SubscribeUserOnlineStatusReq;
import com.github.hitzaki.minchat.service.user.model.resp.UserOnlineStatusResp;

import java.util.Map;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public interface ImUserStatusService {

    public void processUserOnlineStatusNotify(UserStatusChangeNotifyContent content);

    void subscribeUserOnlineStatus(SubscribeUserOnlineStatusReq req);

    void setUserCustomerStatus(SetUserCustomerStatusReq req);

    Map<String, UserOnlineStatusResp> queryFriendOnlineStatus(PullFriendOnlineStatusReq req);

    Map<String, UserOnlineStatusResp> queryUserOnlineStatus(PullUserOnlineStatusReq req);
}
