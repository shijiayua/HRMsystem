package com.zxb.service;

import com.zxb.entitys.User;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface UserService {
    public User queryByName(String name);
    public void add(User user);

    public User queryByNameAndPass(User user);
}
