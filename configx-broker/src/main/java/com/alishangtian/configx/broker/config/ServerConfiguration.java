package com.alishangtian.configx.broker.config;

import com.alishangtian.configx.netty.remoting.config.NettyClientConfig;
import com.alishangtian.configx.netty.remoting.config.NettyServerConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description ServerConfiguration
 * @Date 2020/6/2 下午7:08
 * @Author maoxiaobing
 **/
@Configuration
public class ServerConfiguration {
    @ConfigurationProperties(prefix = "configx.netty.server")
    @Bean
    public NettyServerConfig nettyServerConfig() {
        return new NettyServerConfig();
    }

    @ConfigurationProperties(prefix = "configx.netty.client")
    @Bean
    public NettyClientConfig nettyClientConfig() {
        return new NettyClientConfig();
    }

    @ConfigurationProperties(prefix = "configx.broker")
    @Bean
    public BrokerConfig brokerConfig() {
        return new BrokerConfig();
    }

}
