package com.github.hitzaki.minchat.service.friendship.service;

import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.service.friendship.dao.ImFriendShipGroupEntity;
import com.github.hitzaki.minchat.service.friendship.model.req.AddFriendShipGroupReq;
import com.github.hitzaki.minchat.service.friendship.model.req.DeleteFriendShipGroupReq;

/**
 * @author Chackylee
 * @description
 **/
public interface ImFriendShipGroupService {

    public ResponseVO addGroup(AddFriendShipGroupReq req);

    public ResponseVO deleteGroup(DeleteFriendShipGroupReq req);

    public ResponseVO<ImFriendShipGroupEntity> getGroup(String fromId, String groupName, Integer appId);

    public Long updateSeq(String fromId, String groupName, Integer appId);
}
