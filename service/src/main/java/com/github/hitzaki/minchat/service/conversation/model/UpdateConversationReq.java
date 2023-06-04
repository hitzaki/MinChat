package com.github.hitzaki.minchat.service.conversation.model;

import com.github.hitzaki.minchat.common.model.RequestBase;
import lombok.Data;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class UpdateConversationReq extends RequestBase {

    private String conversationId;

    private Integer isMute;

    private Integer isTop;

    private String fromId;


}
