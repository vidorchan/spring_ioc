package com.vidor;

import com.vidor.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstXml {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ApplicationContext ioc=new ClassPathXmlApplicationContext("spring-ioc.xml");
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

        User user1 = autowireCapableBeanFactory.getBean("user1", User.class);
        System.out.println(user1);

        User user2 = autowireCapableBeanFactory.getBean("user2", User.class);
        System.out.println(user2);
    }
}