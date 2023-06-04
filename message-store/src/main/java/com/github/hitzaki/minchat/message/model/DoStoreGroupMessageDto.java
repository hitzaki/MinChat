package com.github.hitzaki.minchat.message.model;

import com.github.hitzaki.minchat.message.dao.ImMessageBodyEntity;
import com.github.hitzaki.minchat.common.model.message.GroupChatMessageContent;
import lombok.Data;

/**
 * @author Chackylee
 * @description
 **/
@Data
public class DoStoreGroupMessageDto {

    private GroupChatMessageContent groupChatMessageContent;

    private ImMessageBodyEntity imMessageBodyEntity;

}
