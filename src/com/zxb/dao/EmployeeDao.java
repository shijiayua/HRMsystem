package com.zxb.dao;

import com.zxb.entity.Employee;

/**
 * Created by Administrator on 2018/10/18.
 */
public interface EmployeeDao {
    Employee queryByName(String name);
}
