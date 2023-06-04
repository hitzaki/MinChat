package com.github.hitzaki.minchat.codec.pack.user;

import com.github.hitzaki.minchat.common.model.UserSession;
import lombok.Data;

import java.util.List;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class UserStatusChangeNotifyPack {

    private Integer appId;

    private String userId;

    private Integer status;

    private List<UserSession> client;

}
