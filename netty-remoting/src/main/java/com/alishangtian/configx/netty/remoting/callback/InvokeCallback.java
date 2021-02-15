package com.alishangtian.configx.netty.remoting.callback;

import com.alishangtian.configx.netty.remoting.common.ResponseFuture;

/**
 * @Author maoxiaobing
 * @Description
 * @Date 2020/6/2
 * @Param
 * @Return
 */
public interface InvokeCallback {
    /**
     * 回调
     * @param responseFuture
     */
    void operationComplete(final ResponseFuture responseFuture);
}
