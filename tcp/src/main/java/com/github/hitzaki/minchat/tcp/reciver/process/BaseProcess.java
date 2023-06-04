package com.github.hitzaki.minchat.tcp.reciver.process;

import com.github.hitzaki.minchat.codec.proto.MessagePack;
import com.github.hitzaki.minchat.tcp.utils.SessionSocketHolder;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public abstract class BaseProcess {

    public abstract void processBefore();

    public void process(MessagePack messagePack){
        processBefore();
        NioSocketChannel channel = SessionSocketHolder.get(messagePack.getAppId(),
                messagePack.getToId(), messagePack.getClientType(),
                messagePack.getImei());
        if(channel != null){
            channel.writeAndFlush(messagePack);
        }
        processAfter();
    }

    public abstract void processAfter();

}
