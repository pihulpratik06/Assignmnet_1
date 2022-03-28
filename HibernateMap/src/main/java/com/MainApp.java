package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            SessionFactory sessionFactory = configuration.buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            IplTeam dc = new IplTeam();
            dc.setName("Delhi Capitals");
            dc.setOwner("JSW");
            dc.setTid(101);
            System.out.println("How many players for DC");
            int no = Integer.parseInt(br.readLine());
            Map<String, Players> playersMap = new HashMap<>();
            for (int i = 0; i < 2; i++) {
                Players players = new Players();
                System.out.println("ENter pid,pname,bid");
                int pid = Integer.parseInt(br.readLine());
                String pname = br.readLine();
                float bid = Float.parseFloat(br.readLine());
                players.setPid(pid);
                players.setPname(pname);
                players.setBid(bid);
                System.out.println("Enter Country");
                String country = br.readLine();
                playersMap.put(country, players);

            }
            dc.setPlayersMap(playersMap);
            session.save(dc);
            transaction.commit();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
