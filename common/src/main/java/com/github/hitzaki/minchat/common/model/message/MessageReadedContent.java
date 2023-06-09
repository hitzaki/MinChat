package com.github.hitzaki.minchat.common.model.message;

import com.github.hitzaki.minchat.common.model.ClientInfo;
import lombok.Data;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class MessageReadedContent extends ClientInfo {

    private long messageSequence;

    private String fromId;

    private String groupId;

    private String toId;

    private Integer conversationType;

}
