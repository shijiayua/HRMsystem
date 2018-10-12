package com.zxb.dao;

import com.zxb.entitys.User;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface UserDao {
    User queryByName(String name);
    void add(User user);

    User queryByNameAndPass(User user);
}
