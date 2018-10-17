package com.zxb.service;

import com.zxb.dao.DeliverRecordDao;
import com.zxb.entity.DeliverRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/17.
 */@Service("DeliverRecordService")
public class DeliverRecrdServiceImpl implements DeliverRecordService{
     @Autowired
     private DeliverRecordDao deliverRecordDao;
    @Override
    public void addRecord(DeliverRecord deliverRecord) {
        deliverRecordDao.addRecord(deliverRecord);
    }

    @Override
    public List<DeliverRecord> queryAll() {
        List<DeliverRecord> deliverRecords = deliverRecordDao.queryAll();
        return deliverRecords;
    }
}
