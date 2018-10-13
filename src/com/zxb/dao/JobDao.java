package com.zxb.dao;

import com.zxb.entity.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
public interface JobDao {
    List<Job> queryById(int id);
}
