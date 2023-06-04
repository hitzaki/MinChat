package com.github.hitzaki.minchat.service.seq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
@Service
public class RedisSeq {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    public long doGetSeq(String key){
        return stringRedisTemplate.opsForValue().increment(key);
    }


}
