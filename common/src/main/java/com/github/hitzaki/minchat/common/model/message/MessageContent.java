package com.github.hitzaki.minchat.common.model.message;

import com.github.hitzaki.minchat.common.model.ClientInfo;
import lombok.Data;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class MessageContent extends ClientInfo {

    private String messageId;

    private String fromId;

    private String toId;

    private String messageBody;

    private Long messageTime;

    private String extra;

    private Long messageKey;

    private long messageSequence;

}
