package com.github.hitzaki.minchat.service.group.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class GetGroupReq extends RequestBase {

    private String groupId;

}
