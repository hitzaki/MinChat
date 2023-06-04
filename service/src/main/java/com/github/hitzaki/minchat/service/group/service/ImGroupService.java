package com.github.hitzaki.minchat.service.group.service;

import com.github.hitzaki.minchat.service.group.model.req.*;
import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.common.model.SyncReq;
import com.github.hitzaki.minchat.service.group.dao.ImGroupEntity;
import com.github.hitzaki.minchat.service.group.model.req.*;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public interface ImGroupService {

    public ResponseVO importGroup(ImportGroupReq req);

    public ResponseVO createGroup(CreateGroupReq req);

    public ResponseVO updateBaseGroupInfo(UpdateGroupReq req);

    public ResponseVO getJoinedGroup(GetJoinedGroupReq req);

    public ResponseVO destroyGroup(DestroyGroupReq req);

    public ResponseVO transferGroup(TransferGroupReq req);

    public ResponseVO<ImGroupEntity> getGroup(String groupId, Integer appId);

    public ResponseVO getGroup(GetGroupReq req);

    public ResponseVO muteGroup(MuteGroupReq req);

    ResponseVO syncJoinedGroupList(SyncReq req);

    Long getUserGroupMaxSeq(String userId, Integer appId);
}
