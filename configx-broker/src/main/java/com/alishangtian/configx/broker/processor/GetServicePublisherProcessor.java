package com.alishangtian.configx.broker.processor;

import com.alishangtian.configx.broker.controller.BrokerStarter;
import com.alishangtian.configx.common.RemotingCommandResultEnums;
import com.alishangtian.configx.common.util.JSONUtils;
import com.alishangtian.configx.netty.remoting.XtimerCommand;
import com.alishangtian.configx.netty.remoting.processor.NettyRequestProcessor;
import io.netty.channel.ChannelHandlerContext;
import lombok.extern.log4j.Log4j2;

/**
 * 服务发布处理器
 *
 * @Description ServicePublishProcessor
 * @Date 2020/12/23 下午10:00
 * @Author maoxiaobing
 **/
@Log4j2
public class GetServicePublisherProcessor implements NettyRequestProcessor {
    private BrokerStarter brokerStarter;

    public GetServicePublisherProcessor(BrokerStarter brokerStarter) {
        this.brokerStarter = brokerStarter;
    }

    @Override
    public XtimerCommand processRequest(ChannelHandlerContext ctx, XtimerCommand request) throws Exception {
        return XtimerCommand.builder().result(RemotingCommandResultEnums.SUCCESS.getResult()).load(JSONUtils.toJSONString(this.brokerStarter.getPublisherChannels()).getBytes()).build();
    }

    @Override
    public boolean rejectRequest() {
        return false;
    }

}
