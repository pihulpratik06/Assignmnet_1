package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {

    public static void main(String[] args) {


        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Singer singer= (Singer) applicationContext.getBean("singer");
        singer.display();

    }

}
