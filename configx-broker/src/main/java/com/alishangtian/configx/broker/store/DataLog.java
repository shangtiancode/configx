package com.alishangtian.configx.broker.store;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author shangtian
 * @description
 * @date 2021/2/15:15
 */
@Data
@Builder
public class DataLog implements Serializable {
    /**
     * group
     */
    private String group;
    /**
     * key
     */
    private String key;
    /**
     * value
     */
    private String value;
    /**
     * 操作 详见：DataOperateEnum
     */
    private String operate;
    /**
     * 全局索引
     */
    private Long index;
    /**
     * 校验次数
     */
    private int recheckTimes;
}
