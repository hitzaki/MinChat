package com.github.hitzaki.minchat.common.model.message;

import lombok.Data;

/**
 * @description
 * @author lld
 * @version 1.0
 */
@Data
public class DoStoreGroupMessageDto {

    private GroupChatMessageContent groupChatMessageContent;

    private ImMessageBody messageBody;

}
