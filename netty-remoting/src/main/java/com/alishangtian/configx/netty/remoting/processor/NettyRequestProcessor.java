package com.alishangtian.configx.netty.remoting.processor;

import com.alishangtian.configx.netty.remoting.XtimerCommand;
import io.netty.channel.ChannelHandlerContext;

/**
 * @Author maoxiaobing
 * @Description
 * @Date 2020/6/2
 * @Param
 * @Return
 */
public interface NettyRequestProcessor {
    XtimerCommand processRequest(ChannelHandlerContext ctx, XtimerCommand request)
            throws Exception;

    boolean rejectRequest();
}
