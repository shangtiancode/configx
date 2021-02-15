package com.alishangtian.configx.broker.store;

import java.util.LinkedList;
import java.util.List;

/**
 * @author shangtian
 * @description
 * @date 2021/2/15:15
 */
public class MemoryStore {
    /**
     * 数据
     */
    private List<StoreData> storeDatas = new LinkedList<>();
    /**
     * 数据日志
     */
    private List<DataLog> dataLogs = new LinkedList<>();
}
