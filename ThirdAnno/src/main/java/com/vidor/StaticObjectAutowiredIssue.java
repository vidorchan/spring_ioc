package com.vidor;

import com.vidor.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StaticObjectAutowiredIssue {

//    private User uu;
    private static User u;
    @Autowired
//    public void setU( User uu) {
//        this.u = uu;
//    }

//    @Autowired
//    public void setU( User u) {
//        this.u = u;
//    }

    /*
     注解@PostConstruct，在完成构造函数实例化后就调用该方法
    */
//    @PostConstruct
    public void init(User u){
        StaticObjectAutowiredIssue.u = u;
    }

    public static User getU() {
        return u;
    }

    public static void printMethod() {
        u.setName("111");
        System.out.println(u.toString());
    }


}


