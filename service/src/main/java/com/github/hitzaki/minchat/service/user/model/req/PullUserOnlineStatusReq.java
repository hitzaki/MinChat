package com.github.hitzaki.minchat.service.user.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import java.util.List;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class PullUserOnlineStatusReq extends RequestBase {

    private List<String> userList;

}
