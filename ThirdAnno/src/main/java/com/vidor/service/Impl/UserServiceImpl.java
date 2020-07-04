package com.vidor.service.Impl;

import com.vidor.dao.IUserDao;
import com.vidor.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    /**
     * 修改属性的名字：public IUserDao userDaoMysql;
     * @Repository("userDao1")、@Repository("userDao")
     * @Qualifier("userDaoMysql")
     * @Primary
     * 使用泛型
     */
    @Autowired
    @Qualifier("userDaoMysql")
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
