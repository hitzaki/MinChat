package com.github.hitzaki.minchat.common.model.message;

import lombok.Data;
import sun.dc.pr.PRError;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class CheckSendMessageReq {

    private String fromId;

    private String toId;

    private Integer appId;

    private Integer command;

}
