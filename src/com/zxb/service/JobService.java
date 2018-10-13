package com.zxb.service;

import com.zxb.entity.Job;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
public interface JobService {

   public List<Job> queryByid(int id);
}
