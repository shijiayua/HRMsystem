package com.zxb.service;

import com.zxb.dao.DepartmentDao;
import com.zxb.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@Service("DepartmentService")
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public List<Department> queryALL() {
        List<Department> list = departmentDao.queryAll();
        return list;
    }
}
