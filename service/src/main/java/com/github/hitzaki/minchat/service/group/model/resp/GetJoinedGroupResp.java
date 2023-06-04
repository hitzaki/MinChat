package com.github.hitzaki.minchat.service.group.model.resp;

import com.github.hitzaki.minchat.service.group.dao.ImGroupEntity;
import lombok.Data;

import java.util.List;

/**
 * @author hitzaki
 * @description
 **/
@Data
public class GetJoinedGroupResp {

    private Integer totalCount;

    private List<ImGroupEntity> groupList;

}
