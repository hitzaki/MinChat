package com.github.hitzaki.minchat.common.model;

import lombok.Data;

import java.util.List;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class SyncResp<T> {

    private Long maxSequence;

    private boolean isCompleted;

    private List<T> dataList;

}
