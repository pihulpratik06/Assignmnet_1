package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApplication {
    public static void main(String[] args) {

        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        //Object
                Employee employee=new Employee(5,"Pratik");
                PartTimeEmp partTimeEmp=new PartTimeEmp(15,"Virat",10,500);
                FullTimeEmp fullTimeEmp=new FullTimeEmp(25,"Rohit",20000,5,1000);

        //Session Save
        session.save(employee);
        session.save(fullTimeEmp);
        session.save(partTimeEmp);

        transaction.commit();



    }




}
