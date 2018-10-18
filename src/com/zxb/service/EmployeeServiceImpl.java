package com.zxb.service;

import com.zxb.dao.EmployeeDao;
import com.zxb.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/18.
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public Employee queryByName(String name) {
        Employee employee = employeeDao.queryByName(name);
        return employee;
    }
}
