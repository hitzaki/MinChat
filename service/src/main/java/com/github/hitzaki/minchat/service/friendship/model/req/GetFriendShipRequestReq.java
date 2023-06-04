package com.github.hitzaki.minchat.service.friendship.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class GetFriendShipRequestReq extends RequestBase {

    @NotBlank(message = "用户id不能为空")
    private String fromId;

}
