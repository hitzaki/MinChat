package com.github.hitzaki.minchat.service.friendship.model.callback;

import lombok.Data;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class DeleteFriendAfterCallbackDto {

    private String fromId;

    private String toId;
}
