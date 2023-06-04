package com.github.hitzaki.minchat.service.user.model.resp;

import lombok.Data;

import java.util.List;

/**
 * @author Chackylee
 * @description
 **/
@Data
public class ImportUserResp {

    private List<String> successId;

    private List<String> errorId;

}