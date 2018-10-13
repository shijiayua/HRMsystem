package com.zxb.service;

import com.zxb.dao.JobDao;
import com.zxb.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Service("JobService")
public class JobServiceImpl implements JobService{
    @Autowired
    private JobDao jobDao;
    @Override
    public List<Job> queryByid(int id) {
        List<Job> list= jobDao.queryById(id);
        return list;
    }
}
