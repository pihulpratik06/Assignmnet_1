package com.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Shape shape= (Shape) applicationContext.getBean("shape");
        System.out.println("________________________Checking The Methods_________________________");
        System.out.println(applicationContext.containsBean("shape"));
        System.out.println(applicationContext.isSingleton("shape"));
        System.out.println(applicationContext.isPrototype("shape"));
        System.out.println("__________________________Shape Implementation________________________");
        shape.display();
    }
}

//Done Constructor Arguments

//Inner bean in the Same Program