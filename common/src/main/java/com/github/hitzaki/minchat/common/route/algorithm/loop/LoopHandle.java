package com.github.hitzaki.minchat.common.route.algorithm.loop;

import com.github.hitzaki.minchat.common.enums.UserErrorCode;
import com.github.hitzaki.minchat.common.exception.ApplicationException;
import com.github.hitzaki.minchat.common.route.RouteHandle;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @description
 * @author lld
 * @version 1.0
 */
public class LoopHandle implements RouteHandle {

    private AtomicLong index = new AtomicLong();

    @Override
    public String routeServer(List<String> values, String key) {
        int size = values.size();
        if(size == 0){
            throw new ApplicationException(UserErrorCode.SERVER_NOT_AVAILABLE);
        }
        Long l = index.incrementAndGet() % size;
        if(l < 0){
            l = 0L;
        }
        return values.get(l.intValue());
    }
}
