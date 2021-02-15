package com.alishangtian.configx.core.server.processor;

import com.alishangtian.configx.common.RemotingCommandResultEnums;
import com.alishangtian.configx.common.protocol.InvokeServiceBody;
import com.alishangtian.configx.common.util.JSONUtils;
import com.alishangtian.configx.netty.remoting.XtimerCommand;
import com.alishangtian.configx.netty.remoting.common.XtimerHelper;
import com.alishangtian.configx.netty.remoting.processor.NettyRequestProcessor;
import com.alishangtian.configx.core.server.MubboServer;
import com.fasterxml.jackson.core.type.TypeReference;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description ServerChannelProcessor
 * @Date 2020/6/2 下午7:23
 * @Author maoxiaobing
 **/
@Slf4j
public class ServiceInvokeProcessor implements NettyRequestProcessor {
    private MubboServer mubboServer;

    public ServiceInvokeProcessor(MubboServer mubboServer) {
        this.mubboServer = mubboServer;
    }

    @Override
    public XtimerCommand processRequest(ChannelHandlerContext ctx, XtimerCommand request) throws Exception {
        this.mubboServer.addSubscriber(String.valueOf(request.getLoad()), XtimerHelper.parseChannelRemoteAddr(ctx.channel()), ctx.channel());
        return XtimerCommand.builder().result(RemotingCommandResultEnums.SUCCESS.getResult()).load(mubboServer.invokeServiceInvoke(JSONUtils.parseObject(request.getLoad(), new TypeReference<InvokeServiceBody>() {
        }))).build();
    }

    @Override
    public boolean rejectRequest() {
        return false;
    }
}
