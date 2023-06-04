package com.github.hitzaki.minchat.message.model;

import com.github.hitzaki.minchat.message.dao.ImMessageBodyEntity;
import com.github.hitzaki.minchat.common.model.message.MessageContent;
import lombok.Data;

/**
 * @author Chackylee
 * @description
 **/
@Data
public class DoStoreP2PMessageDto {

    private MessageContent messageContent;

    private ImMessageBodyEntity imMessageBodyEntity;

}
