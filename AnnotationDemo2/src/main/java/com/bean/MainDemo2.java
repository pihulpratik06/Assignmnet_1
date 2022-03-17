package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import  org.hibernate.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainDemo2 {

    public static void main(String[] args) {

        //Step 1;

        Players players=new Players();

        players.setPlayerName("Steven Smith");
        players.setTeam("Australia");
        players.setAvg(40.25f);
        players.setStrike_rate(92.06f);

        //Step 2

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        int i = (int) session.save(players);

        if (i > 0) {
            transaction.commit();
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

    }




    }


