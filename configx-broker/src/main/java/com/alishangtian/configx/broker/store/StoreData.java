package com.alishangtian.configx.broker.store;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 单条数据
 * @description
 * @date 2021/2/15:15
 */
@Data
@Builder
public class StoreData implements Serializable {
    /**
     * key
     */
    private String key;
    /**
     * value
     */
    private String value;
    /**
     * 全局索引
     */
    private Long index;
}
