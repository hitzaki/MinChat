package com.github.hitzaki.minchat.service.friendship.model.req;


import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotBlank;


@Data
public class DeleteBlackReq extends RequestBase {

    @NotBlank(message = "用户id不能为空")
    private String fromId;

    @NotBlank(message = "好友id不能为空")
    private String toId;

}
