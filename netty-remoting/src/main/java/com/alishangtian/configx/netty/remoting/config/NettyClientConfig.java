package com.alishangtian.configx.netty.remoting.config;

import lombok.Data;

/**
 * @Author maoxiaobing
 * @Description
 * @Date 2020/6/2
 * @Param
 * @Return
 */
@Data
public class NettyClientConfig {
    /**
     * Worker thread number
     */
    private int clientWorkerThreads = 4;
    private int clientCallbackExecutorThreads = Runtime.getRuntime().availableProcessors();
    private int clientOnewaySemaphoreValue = 65535;
    private int clientAsyncSemaphoreValue = 65535;
    private int connectTimeoutMillis = 3000;
    private long channelNotActiveInterval = 1000 * 60;
    private int clientChannelMaxIdleTimeSeconds = 120;

    private int clientSocketSndBufSize = 65535;
    private int clientSocketRcvBufSize = 65535;
    private boolean clientPooledByteBufAllocatorEnable = false;
    private boolean clientCloseSocketIfTimeout = false;

    private boolean useTLS;

}
