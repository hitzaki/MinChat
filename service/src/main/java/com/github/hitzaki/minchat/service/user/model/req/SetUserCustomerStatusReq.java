package com.github.hitzaki.minchat.service.user.model.req;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class SetUserCustomerStatusReq extends RequestBase {

    private String userId;

    private String customText;

    private Integer customStatus;

}
