package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;

public class MainApplication {

    public static void main(String[] args) {

        Configuration configuration=new Configuration().configure("hibernate.hbm.xml");
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

         Director director=new Director();
         director.setId(101);
         director.setName("Yash Chopra");

        HashSet<Movie> hashSet=new HashSet<>();
        hashSet.add(new Movie(1,"DDLJ"));
        hashSet.add(new Movie(2,"kala Phatthar"));
        hashSet.add(new Movie(3,"Mohabbatien"));
        hashSet.add(new Movie(4,"Dhoom"));

         director.setMovies(hashSet);

        Director director1=new Director();
        director1.setId(102);
        director1.setName("Karan Johar");

        HashSet<Movie> hashSet1=new HashSet<>();
        hashSet1.add(new Movie(5,"SOTY"));
        hashSet1.add(new Movie(6,"Soty2"));
        hashSet1.add(new Movie(7,"Aae Dil hai Mushkil"));
        hashSet1.add(new Movie (8,"My name is Khan"));
        director1.setMovies(hashSet1);

         session.save(director);
         session.save(director1);

        transaction.commit();
        }




    }

