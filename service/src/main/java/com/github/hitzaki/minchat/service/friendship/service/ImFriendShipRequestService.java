package com.github.hitzaki.minchat.service.friendship.service;

import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.service.friendship.model.req.ApproverFriendRequestReq;
import com.github.hitzaki.minchat.service.friendship.model.req.FriendDto;
import com.github.hitzaki.minchat.service.friendship.model.req.ReadFriendShipRequestReq;


public interface ImFriendShipRequestService {

    public ResponseVO addFienshipRequest(String fromId, FriendDto dto, Integer appId);

    public ResponseVO approverFriendRequest(ApproverFriendRequestReq req);

    public ResponseVO readFriendShipRequestReq(ReadFriendShipRequestReq req);

    public ResponseVO getFriendRequest(String fromId, Integer appId);
}
