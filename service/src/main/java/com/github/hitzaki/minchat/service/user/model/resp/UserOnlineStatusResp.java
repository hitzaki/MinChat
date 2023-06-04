package com.github.hitzaki.minchat.service.user.model.resp;

import com.github.hitzaki.minchat.common.model.UserSession;
import lombok.Data;

import java.util.List;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Data
public class UserOnlineStatusResp {

    private List<UserSession> session;

    private String customText;

    private Integer customStatus;

}
