package com.zxb.service;

import com.zxb.dao.RecuitmentDao;
import com.zxb.entity.Recuitment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Service("RecuitmentService")
public class RecuitmentServiceImpl implements  RecuitmentService {
    @Autowired
    private RecuitmentDao recuitmentDao;
    @Override
    public List<Recuitment> queryAll() {
        List<Recuitment> list=recuitmentDao.queryAll();
        return list;
    }
}
