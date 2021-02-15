package com.alishangtian.configx.netty.client.processor;

import com.alishangtian.configx.netty.client.DefaultMacosClient;
import com.alishangtian.configx.common.protocol.PublishServiceBody;
import com.alishangtian.configx.common.util.JSONUtils;
import com.alishangtian.configx.netty.remoting.XtimerCommand;
import com.alishangtian.configx.netty.remoting.processor.NettyRequestProcessor;
import com.alishangtian.configx.common.RemotingCommandResultEnums;
import io.netty.channel.ChannelHandlerContext;

/**
 * @author shangtian
 * @description
 * @date 2021/2/13:12
 */
public class NotifySubServiceProcessor implements NettyRequestProcessor {
    private DefaultMacosClient defaultMacosClient;

    public NotifySubServiceProcessor(DefaultMacosClient defaultMacosClient) {
        this.defaultMacosClient = defaultMacosClient;
    }

    @Override
    public XtimerCommand processRequest(ChannelHandlerContext ctx, XtimerCommand request) throws Exception {
        PublishServiceBody publishServiceBody = JSONUtils.parseObject(request.getLoad(), PublishServiceBody.class);
        defaultMacosClient.addPublishServiceBody(publishServiceBody);
        return XtimerCommand.builder().result(RemotingCommandResultEnums.SUCCESS.getResult()).build();
    }

    @Override
    public boolean rejectRequest() {
        return false;
    }
}
