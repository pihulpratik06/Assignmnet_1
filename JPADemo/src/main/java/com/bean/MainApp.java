package com.bean;

import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainApp {

    public static void main(String[] args) {

        EntityManagerFactory entityManager= Persistence.createEntityManagerFactory("pratik");

        EntityManager entityManager1=entityManager.createEntityManager();

        /*

         Players players=entityManager1.find(Players.class,1);
        System.out.println(players);

         */



        //For Dynamic

        EntityTransaction transaction= entityManager1.getTransaction();

        transaction.begin();



        Players players1=new Players();

        players1.setName("FAF DU Plesis");
        players1.setTeamName("RCB");
      entityManager1.persist(players1);
        System.out.println(players1);


        transaction.commit();
        entityManager.close();
        entityManager1.close();


    }

}
