package com.alishangtian.configx.netty.remoting.exception;

/**
 * @Description NoMoreChannelException
 * @Date 2020/6/3 下午1:55
 * @Author maoxiaobing
 **/
public class NoMoreChannelException extends Exception {
    public NoMoreChannelException(String msg) {
        super(msg);
    }

    public NoMoreChannelException() {
        this("no more active channel");
    }
}
