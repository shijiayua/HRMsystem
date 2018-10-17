package com.zxb.dao;

import com.zxb.entity.DeliverRecord;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface DeliverRecordDao {
    void addRecord(DeliverRecord deliverRecord);

    List<DeliverRecord> queryAll();
}
