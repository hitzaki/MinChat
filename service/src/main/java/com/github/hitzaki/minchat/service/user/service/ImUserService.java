package com.github.hitzaki.minchat.service.user.service;

import com.github.hitzaki.minchat.service.user.model.req.*;
import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.service.user.dao.ImUserDataEntity;
import com.github.hitzaki.minchat.service.user.model.req.*;
import com.github.hitzaki.minchat.service.user.model.resp.GetUserInfoResp;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public interface ImUserService {

    public ResponseVO importUser(ImportUserReq req);   // 批量导入用户信息

    public ResponseVO<GetUserInfoResp> getUserInfo(GetUserInfoReq req);   // 批量获取用户信息

    public ResponseVO<ImUserDataEntity> getSingleUserInfo(String userId , Integer appId);   // 获取单独用户信息

    public ResponseVO deleteUser(DeleteUserReq req);

    public ResponseVO modifyUserInfo(ModifyUserInfoReq req);

    public ResponseVO login(LoginReq req);

    ResponseVO getUserSequence(GetUserSequenceReq req);

}
