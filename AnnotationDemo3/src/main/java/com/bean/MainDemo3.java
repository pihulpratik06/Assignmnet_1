package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import  org.hibernate.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainDemo3 {

    public static void main(String[] args) {

        //Step 1;

        Players1 players=new Players1();

        players.setPlayerName("MS Dhoni");
        players.setTeam("India");
        players.setAvg(50.25f);
        players.setStrike_rate(92.06f);

        //Step 2

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        int i=(int)session.save(players);
        if (i > 0) {
            transaction.commit();
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

    }




}


