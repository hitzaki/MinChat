package com.github.hitzaki.minchat.service.group.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import java.util.List;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class GetRoleInGroupReq extends RequestBase {

    private String groupId;

    private List<String> memberId;
}
