package com.alishangtian.configx.netty.remoting.netty;

import com.alishangtian.configx.netty.remoting.XtimerCommand;

public interface RemotingResponseCallback {
    void callback(XtimerCommand response);
}
