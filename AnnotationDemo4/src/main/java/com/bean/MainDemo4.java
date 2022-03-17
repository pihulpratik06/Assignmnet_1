package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import  org.hibernate.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainDemo4 {

    public static void main(String[] args) {

        //Step 1;

        Players2 players=new Players2();

        players.setPlayerName("Babar Azam");
        players.setTeam("Pakistan");
        players.setAvg(45.25f);
        players.setStrike_rate(87.06f);

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


