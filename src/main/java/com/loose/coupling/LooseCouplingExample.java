package com.loose.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationLooseCoupling.xml");
        UserManager userManagerWEB = (UserManager) context.getBean("userManagerWEB");
        System.out.println(userManagerWEB.getUserInfo());

        UserManager userManagerDB = (UserManager) context.getBean("userManagerDB");
        System.out.println(userManagerDB.getUserInfo());
    }
}
