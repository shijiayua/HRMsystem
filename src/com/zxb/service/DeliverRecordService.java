package com.zxb.service;

import com.zxb.entity.DeliverRecord;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */
public interface DeliverRecordService {
    public void addRecord(DeliverRecord deliverRecord);

   public List<DeliverRecord> queryAll();
}
