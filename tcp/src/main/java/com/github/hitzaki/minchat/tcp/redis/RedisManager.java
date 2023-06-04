package com.github.hitzaki.minchat.tcp.redis;

import com.github.hitzaki.minchat.codec.config.BootstrapConfig;
import com.github.hitzaki.minchat.tcp.reciver.UserLoginMessageListener;
import com.sun.org.apache.regexp.internal.RE;
import org.redisson.api.RedissonClient;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public class RedisManager {

    private static RedissonClient redissonClient;

    private static Integer loginModel;

    public static void init(BootstrapConfig config){
        loginModel = config.getLim().getLoginModel();
        SingleClientStrategy singleClientStrategy = new SingleClientStrategy();
        redissonClient = singleClientStrategy.getRedissonClient(config.getLim().getRedis());
        UserLoginMessageListener userLoginMessageListener = new UserLoginMessageListener(loginModel);
        userLoginMessageListener.listenerUserLogin();
    }

    public static RedissonClient getRedissonClient(){
        return redissonClient;
    }

}
