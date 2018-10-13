package com.zxb.dao;

import com.zxb.entity.Department;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface DepartmentDao {
    List<Department> queryAll();
}
