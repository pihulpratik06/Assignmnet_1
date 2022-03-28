package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        FilmDetails filmDetails = new FilmDetails();
        filmDetails.setId(131);
        filmDetails.setName("MS Dhoni-The Untold Story");


        List<Songs> list = new ArrayList<>();
        list.add(new Songs( 1311,"JabTak"));
        list.add(new Songs(1312,"Phir kabhi"));
        list.add(new Songs(1313,"Parwah nahi"));
        filmDetails.setSongs(list);

        FilmDetails filmDetails1 = new FilmDetails();
        filmDetails1.setId(132);
        filmDetails1.setName("Chichoree");

        List<Songs> list1 = new ArrayList<>();
        list1.add(new Songs(1321,"Woh Din"));
        list1.add(new Songs(1322,"Khairiyat"));
        list1.add(new Songs(1323,"Control"));
        filmDetails1.setSongs(list1);

         session.save(filmDetails);
         session.save(filmDetails1);


          transaction.commit();
          session.close();
    }


}
