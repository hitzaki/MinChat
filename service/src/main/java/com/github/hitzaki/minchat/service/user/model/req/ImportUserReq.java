package com.github.hitzaki.minchat.service.user.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import com.github.hitzaki.minchat.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;


@Data
public class ImportUserReq extends RequestBase {

    private List<ImUserDataEntity> userData;


}
