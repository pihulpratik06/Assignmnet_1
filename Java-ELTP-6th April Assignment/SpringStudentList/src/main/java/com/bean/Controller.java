//Using Setter and Getters

package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
     public static void main(String[] args) {

          ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
          Batch batch=(Batch) applicationContext.getBean("batch");

           batch.display();


     }
}
/*
Batch Number::1
Number of Studs::101
Students{name='Pratik', studentID=1, percentage=89.55, degree='BSc'}
Students{name='Shubham', studentID=2, percentage=79.55, degree='BTech'}



 */