package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Students students=(Students) applicationContext.getBean("students");
        Students students1=(Students) applicationContext.getBean("students");
        students.display();
        System.out.println(students);
        System.out.println(students1);



    }
}
/*
 Every entity has different Prototype
 Id==>1
Name==>Pratik
com.bean.Students@36b4fe2a
com.bean.Students@574b560f

 */