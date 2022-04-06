package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("SpringDemo.xml");

       Players players=(Players) applicationContext.getBean("players");

        System.out.println(players);

    }

}
