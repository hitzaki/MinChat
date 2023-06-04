package com.github.hitzaki.minchat.service.user.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;


@Data
public class DeleteUserReq extends RequestBase {

    @NotEmpty(message = "用户id不能为空")
    private List<String> userId;
}
