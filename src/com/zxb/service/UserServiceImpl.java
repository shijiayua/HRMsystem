package com.zxb.service;

import com.zxb.dao.UserDao;
import com.zxb.entitys.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/12.
 */@Service("UserService")
public class UserServiceImpl implements UserService {
     @Autowired
    private UserDao userDao;
    @Override
    public User queryByName(String name) {
       return userDao.queryByName(name);
    }

    @Override
    public void add(User user) {
         userDao.add(user);

    }

    @Override
    public User queryByNameAndPass(User user) {
        return userDao.queryByNameAndPass( user);

    }
}
