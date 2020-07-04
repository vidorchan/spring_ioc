package com.vidor.service.Impl;

import com.vidor.dao.IUserDao;
import com.vidor.service.UserService;

public class UserServiceImpl implements UserService {

    public IUserDao userDao;

    public void addUser() {
        userDao.addUser();
        System.out.println("执行。。。");
    }

    public IUserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }
}
