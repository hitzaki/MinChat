package com.github.hitzaki.minchat.tcp.feign;

import com.github.hitzaki.minchat.common.ResponseVO;
import com.github.hitzaki.minchat.common.model.message.CheckSendMessageReq;
import feign.Headers;
import feign.RequestLine;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public interface FeignMessageService {

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @RequestLine("POST /message/checkSend")
    public ResponseVO checkSendMessage(CheckSendMessageReq o);

}
