package com.spring.demo.service.impl;

import com.spring.demo.dao.impl.UserDaoImpl;
import com.spring.demo.po.User;
import org.springframework.aop.framework.AopContext;

//@Service
public class UserServiceImpl {
    private UserDaoImpl userDao;

    public UserDaoImpl getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public void insertUser(User user) {
        userDao.insertUser(user);
        //c();
    }
    public void b(User user) {
//        throw new RuntimeException();
//        insertUser(user);
        UserServiceImpl userServiceProxy = (UserServiceImpl) AopContext.currentProxy();
        userServiceProxy.insertUser(user);
    }
    public void c(){
        throw new RuntimeException();
    }
}
