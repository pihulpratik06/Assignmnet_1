package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainDemo2 {

    public static void main(String[] args) {
        Players players=new Players();
        //Step 1;
/*
        ;

        players.setPlayerName("Sheryash Iyer");
        players.setTeam("India");
        players.setAvg(39.36f);
        players.setStrike_rate(81.6f);
*/
        //Step 2

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

       session.save(players);

       transaction.commit();

        // Step 3
        //Hibernate  Caching
        //First Level
        //By default enabled




            Players players1 = session.get(Players.class, 14);
            System.out.println(players1);

            System.out.println("*********Firing the query again*******");

            Players players2 = session.get(Players.class, 14);
            System.out.println(players2);


            Players players3 = session.get(Players.class, 14);
            System.out.println(players3);

            Players players4 = session.get(Players.class, 15);
            System.out.println(players4);




        session.close();


    }
}


