package com.alishangtian.configx.netty.remoting.exception;

/** 
 * @Author maoxiaobing
 * @Description
 * @Date 2020/6/2
 * @Param 
 * @Return 
 */
public class RemotingTimeoutException extends RemotingException {

    private static final long serialVersionUID = 4106899185095245979L;

    public RemotingTimeoutException(String message) {
        super(message);
    }

    public RemotingTimeoutException(String addr, long timeoutMillis) {
        this(addr, timeoutMillis, null);
    }

    public RemotingTimeoutException(String addr, long timeoutMillis, Throwable cause) {
        super("wait response on the channel <" + addr + "> timeout, " + timeoutMillis + "(ms)", cause);
    }
}
