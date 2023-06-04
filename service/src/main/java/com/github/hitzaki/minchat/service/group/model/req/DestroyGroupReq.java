package com.github.hitzaki.minchat.service.group.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class DestroyGroupReq extends RequestBase {

    @NotNull(message = "群id不能为空")
    private String groupId;

}
