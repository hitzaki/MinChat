package com.github.hitzaki.minchat.service.friendship.service;

import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.service.friendship.model.req.AddFriendShipGroupMemberReq;
import com.github.hitzaki.minchat.service.friendship.model.req.DeleteFriendShipGroupMemberReq;

/**
 * @author hitzaki
 * @description
 **/
public interface ImFriendShipGroupMemberService {

    public ResponseVO addGroupMember(AddFriendShipGroupMemberReq req); // 批量添加

    public ResponseVO delGroupMember(DeleteFriendShipGroupMemberReq req);

    // public int doAddGroupMember(Long groupId, String toId);  // 供批量添加调用的

    public int clearGroupMember(Long groupId);
}
