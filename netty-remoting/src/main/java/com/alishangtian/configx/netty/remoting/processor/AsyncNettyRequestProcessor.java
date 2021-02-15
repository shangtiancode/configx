package com.alishangtian.configx.netty.remoting.processor;

import com.alishangtian.configx.netty.remoting.XtimerCommand;
import com.alishangtian.configx.netty.remoting.netty.RemotingResponseCallback;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Author maoxiaobing
 * @Description
 * @Date 2020/6/2
 * @Param
 * @Return
 */
public abstract class AsyncNettyRequestProcessor implements NettyRequestProcessor {

    public void asyncProcessRequest(ChannelHandlerContext ctx, XtimerCommand request, RemotingResponseCallback responseCallback) throws Exception {
        XtimerCommand response = processRequest(ctx, request);
        responseCallback.callback(response);
    }
}
