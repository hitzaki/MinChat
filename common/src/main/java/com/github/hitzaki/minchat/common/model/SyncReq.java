package com.github.hitzaki.minchat.common.model;

import lombok.Data;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class SyncReq extends RequestBase {

    //客户端最大seq
    private Long lastSequence;
    //一次拉取多少
    private Integer maxLimit;

}
