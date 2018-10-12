package com.zxb.service;

import com.zxb.dao.ResumeDao;
import com.zxb.entitys.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12.
 */@Service("ResumeService")
public class ResumeServiceImpl implements ResumeService {
     @Autowired
     private ResumeDao resumeDao;
    @Override
    public void save(Resume resume) {
        resumeDao.save(resume);
    }
}
