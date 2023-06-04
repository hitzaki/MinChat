package com.github.hitzaki.minchat.message.dao;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author hitzaki
 * @description
 **/
@Data
@TableName("im_message_body")
public class ImMessageBodyEntity {

    private Integer appId;

    /** messageBodyId*/
    private Long messageKey;

    /** messageBody*/
    private String messageBody;

    private String securityKey;

    private Long messageTime;

    private Long createTime;

    private String extra;

    private Integer delFlag;

}
