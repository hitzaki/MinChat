package com.github.hitzaki.minchat.service.friendship.model.callback;

import com.github.hitzaki.minchat.service.friendship.model.req.FriendDto;
import lombok.Data;

/**
 * @description REVIEW-由于给不同app接入, 所以需要知道哪些添加成功, 所以需要一个回调数据集合
 * @author hitzaki
 * @version 1.0
 */
@Data
public class AddFriendAfterCallbackDto {

    private String fromId;

    private FriendDto toItem;
}
