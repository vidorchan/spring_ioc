package com.vidor.dao.Impl;

import com.vidor.dao.IUserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoMysql implements IUserDao {

    public UserDaoMysql(){
        System.out.println("mysql use");
    }

    public void addUser() {
        System.out.println("Mysql dao...");
    }
}
