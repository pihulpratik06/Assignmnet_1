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

         Movie movie =new Movie();
         movie.setId(101);
         movie.setName("Ye Jawani hai Diwani");

        HashSet<Director> hashSet=new HashSet<>();
        hashSet.add(new Director(1,"Ayan Mukerji"));
        hashSet.add(new Director(2,"Nikhil Lunawat"));
        hashSet.add(new Director(3,"Sankalp Wanjari"));
        hashSet.add(new Director(4,"Shubham Patil"));
        movie.setDirectors(hashSet);

        Movie movie1=new Movie();
        movie1.setId(102);
        movie1.setName("3 Idiots");

        HashSet<Director> hashSet1=new HashSet<>();
        hashSet1.add(new Director(5,"Rajkumar Hirani"));
        hashSet1.add(new Director(6,"Pratik Pihul"));
        hashSet1.add(new Director(7,"Gavrav Patil"));
        hashSet1.add(new Director(8,"Omkar Mandlik"));
        movie1.setDirectors(hashSet1);

        Movie movie2=new Movie();
        movie2.setId(103);
        movie2.setName("MS Dhoni:: The Untold Story");


        HashSet<Director> hashSet2=new HashSet<>();
        hashSet2.add(new Director(9,"Neeraj Pandey"));
        hashSet2.add(new Director(10,"Prachi Patil"));
        hashSet2.add(new Director(11,"Sakshi Patil"));
        hashSet2.add(new Director(12,"Harshal Tingre"));
        movie2.setDirectors(hashSet2);




      session.save(movie);
      session.save(movie1);
      session.save(movie2);



        transaction.commit();





        }
}

