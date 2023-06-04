package com.github.hitzaki.minchat.common.enums;

import com.github.hitzaki.minchat.common.exception.ApplicationExceptionEnum;

/**
 * @author hitzaki
 * @description
 **/
public enum ConversationErrorCode implements ApplicationExceptionEnum {

    CONVERSATION_UPDATE_PARAM_ERROR(50000,"會話修改參數錯誤"),


    ;

    private int code;
    private String error;

    ConversationErrorCode(int code, String error){
        this.code = code;
        this.error = error;
    }
    public int getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

}
