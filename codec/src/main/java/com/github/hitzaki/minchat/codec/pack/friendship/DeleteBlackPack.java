package com.github.hitzaki.minchat.codec.pack.friendship;

import lombok.Data;

/**
 * @author hitzaki
 * @description 删除黑名单通知报文
 **/
@Data
public class DeleteBlackPack {

    private String fromId;

    private String toId;

    private Long sequence;
}
