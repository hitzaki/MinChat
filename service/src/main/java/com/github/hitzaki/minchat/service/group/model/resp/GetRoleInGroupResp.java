package com.github.hitzaki.minchat.service.group.model.resp;

import lombok.Data;

/**
 * @author Chackylee
 * @description
 **/
@Data
public class GetRoleInGroupResp {

    private Long groupMemberId;

    private String memberId;

    private Integer role;

    private Long speakDate;

}
