package com.alishangtian.configx.netty.remoting;

import com.alishangtian.configx.netty.remoting.exception.RemotingSendRequestException;
import com.alishangtian.configx.netty.remoting.exception.RemotingTooMuchRequestException;
import com.alishangtian.configx.netty.remoting.processor.NettyRequestProcessor;
import com.alishangtian.configx.netty.remoting.callback.InvokeCallback;
import com.alishangtian.configx.netty.remoting.common.Pair;
import com.alishangtian.configx.netty.remoting.exception.RemotingTimeoutException;
import io.netty.channel.Channel;

import java.util.concurrent.ExecutorService;

/**
 * @Description RemotingServer
 * @Date 2020/6/1 下午8:03
 * @Author maoxiaobing
 **/
public interface RemotingServer extends RemotingService {
    void registerProcessor(final int requestCode, final NettyRequestProcessor processor,
                           final ExecutorService executor);

    void registerDefaultProcessor(final NettyRequestProcessor processor, final ExecutorService executor);

    int localListenPort();

    Pair<NettyRequestProcessor, ExecutorService> getProcessorPair(final int requestCode);

    XtimerCommand invokeSync(final Channel channel, final XtimerCommand request,
                             final long timeoutMillis) throws InterruptedException, RemotingSendRequestException,
            RemotingTimeoutException;

    void invokeAsync(final Channel channel, final XtimerCommand request, final long timeoutMillis,
                     final InvokeCallback invokeCallback) throws InterruptedException,
            RemotingTooMuchRequestException, RemotingTimeoutException, RemotingSendRequestException;

    void invokeOneway(final Channel channel, final XtimerCommand request, final long timeoutMillis)
            throws InterruptedException, RemotingTooMuchRequestException, RemotingTimeoutException,
            RemotingSendRequestException;
}
