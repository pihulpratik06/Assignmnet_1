//Driver
//
package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controller {
    public static void main(String[] args) {



         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
         BookDao bookDao = (BookDao) applicationContext.getBean("bookDao");
         Book book=new Book();
         book.setBid(101);
         book.setBookName("C++ Primer");
         book.setAuthorName("Stefen Prefa");
         book.setPrice(290);
         bookDao.insert(book);
 //       bookDao.update("Python",1000);


            }
        }
