package com.alishangtian.configx.broker.store;

import lombok.Builder;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author shangtian
 * @description
 * @date 2021/2/15:15
 */
@Data
@Builder
public class MemoryStore {
    /**
     * 数据
     */
    private final List<StoreData> storeDatas = new LinkedList<>();
    /**
     * 数据日志
     */
    private final List<DataLog> dataLogs = new LinkedList<>();
    /**
     * 检测索引
     */
    private final AtomicLong checkIndex = new AtomicLong(0);

    /**
     * 添加DataLog
     *
     * @param dataLog
     * @return
     */
    public boolean addDataLog(DataLog dataLog) {
        return true;
    }

}
