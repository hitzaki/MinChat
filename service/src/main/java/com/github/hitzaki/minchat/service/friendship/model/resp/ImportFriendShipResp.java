package com.github.hitzaki.minchat.service.friendship.model.resp;

import lombok.Data;

import java.util.List;

// REVIEW-批量导入关系链
@Data
public class ImportFriendShipResp {

    private List<String> successId;

    private List<String> errorId;
}
