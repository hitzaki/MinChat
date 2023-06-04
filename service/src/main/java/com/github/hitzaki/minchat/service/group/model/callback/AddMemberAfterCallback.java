package com.github.hitzaki.minchat.service.group.model.callback;

import com.github.hitzaki.minchat.service.group.model.resp.AddMemberResp;
import lombok.Data;

import java.util.List;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class AddMemberAfterCallback {
    private String groupId;
    private Integer groupType;
    private String operater;
    private List<AddMemberResp> memberId;
}
