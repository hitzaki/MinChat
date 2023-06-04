package com.github.hitzaki.minchat.codec.pack.user;

import com.github.hitzaki.minchat.common.model.UserSession;
import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: lld
 * @version: 1.0
 */
@Data
public class UserCustomStatusChangeNotifyPack {

    private String customText;

    private Integer customStatus;

    private String userId;

}
