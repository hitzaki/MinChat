package com.github.hitzaki.minchat.service.user.model.resp;

import com.github.hitzaki.minchat.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;

/**
 * @author Chackylee
 * @description
 **/
@Data
public class GetUserInfoResp {

    private List<ImUserDataEntity> userDataItem;

    private List<String> failUser;


}
