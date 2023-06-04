package com.github.hitzaki.minchat.service.friendship.service;

import com.github.hitzaki.minchat.service.friendship.model.req.*;
import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.common.model.RequestBase;
import com.github.hitzaki.minchat.common.model.SyncReq;

import java.util.List;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public interface ImFriendService {

    public ResponseVO importFriendShip(ImporFriendShipReq req);

    public ResponseVO addFriend(AddFriendReq req);

    public ResponseVO updateFriend(UpdateFriendReq req);

    public ResponseVO deleteFriend(DeleteFriendReq req);

    public ResponseVO deleteAllFriend(DeleteFriendReq req);

    public ResponseVO getAllFriendShip(GetAllFriendShipReq req);

    public ResponseVO getFriendShip(GetRelationReq req);

    public ResponseVO doAddFriend(RequestBase requestBase,String fromId, FriendDto dto, Integer appId);

    public ResponseVO checkFriendship(CheckFriendShipReq req);

    public ResponseVO addBlack(AddFriendShipBlackReq req);

    public ResponseVO deleteBlack(DeleteBlackReq req);

    public ResponseVO checkBlck(CheckFriendShipReq req);

    public ResponseVO syncFriendshipList(SyncReq req);

    public List<String> getAllFriendId(String userId, Integer appId);
}
