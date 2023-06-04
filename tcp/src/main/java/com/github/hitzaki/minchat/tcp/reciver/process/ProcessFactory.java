package com.github.hitzaki.minchat.tcp.reciver.process;

/**
 * @description
 * @author hitzaki
 * @version 1.0
 */
public class ProcessFactory {

    private static BaseProcess defaultProcess;

    static {
        defaultProcess = new BaseProcess() {
            @Override
            public void processBefore() {

            }

            @Override
            public void processAfter() {

            }
        };
    }

    public static BaseProcess getMessageProcess(Integer command) {
        return defaultProcess;
    }

}
