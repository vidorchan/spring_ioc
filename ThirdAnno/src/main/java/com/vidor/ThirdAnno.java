package com.vidor;

import com.vidor.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThirdAnno {
    public static void main(String[] args){
        ApplicationContext ioc=new AnnotationConfigApplicationContext(JavaConfig.class);
        org.springframework.beans.factory.config.AutowireCapableBeanFactory autowireCapableBeanFactory = ioc.getAutowireCapableBeanFactory();
        /*
        User.class.newInstance() 多例模式
         */
        User user = autowireCapableBeanFactory.getBean("user", User.class);
        user.setName("222");
        System.out.println(user);

        /*
        默认单例singleton，多例prototype
         */
        User singleTonUser = autowireCapableBeanFactory.getBean("user", User.class);
        System.out.println(singleTonUser);

        StaticObjectAutowiredIssue.printMethod();
    }
}