package com.vidor.dao.Impl;

import com.vidor.dao.IUserDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary
public class UserDaoOracle implements IUserDao{

    public UserDaoOracle(){
        System.out.println("oracle use");
    }

    public void addUser() {
        System.out.println("Oracle dao...");
    }
}
