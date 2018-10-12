package com.zxb.test;

import com.zxb.dao.UserDao;
import com.zxb.entitys.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2018/10/12.
*/
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration("classpath:spring.xml")
public class TestUserDao {

 @Autowired
 private UserDao userDao;

 @Test
 public void test3() {
    User user=userDao.queryByName("123");
  System.out.println(user);
 }
}
