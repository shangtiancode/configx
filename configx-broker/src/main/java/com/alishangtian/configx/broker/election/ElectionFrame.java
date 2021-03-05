package com.alishangtian.configx.broker.election;

import com.alishangtian.configx.broker.store.DataLog;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author shangtian
 * @description
 * @date 2021/2/26:17
 */
@Data
@Builder
public class ElectionFrame implements Serializable {
    /**
     * 当前最大索引
     */
    private long checkIndex;
    /**
     * 节点id
     */
    private int brokerId;
    /**
     * 节点host
     */
    private String brokerHost;
    /**
     * 投票结果
     */
    private int result;
    /**
     * 远程服务checkpoint
     */
    private long remoteCheckIndex;
    /**
     * 远程返回数据
     */
    private List<DataLog> remoteDatas;

}
