package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

    public static void main(String[] args) {

         try {

             Configuration configuration = new Configuration().configure();
             SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession();
             Transaction transaction = session.beginTransaction();

             Address address = new Address("India", "Maharasta", "Jalgaon");

             Student student = new Student("Pratik Pihul", address);


             session.save(student);

             transaction.commit();


         }catch (Exception e){
              e.printStackTrace();
         }





    }
}
