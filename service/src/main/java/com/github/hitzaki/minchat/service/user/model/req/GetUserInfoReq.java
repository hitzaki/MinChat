package com.github.hitzaki.minchat.service.user.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import java.util.List;


@Data
public class GetUserInfoReq extends RequestBase {

    private List<String> userIds;


}
