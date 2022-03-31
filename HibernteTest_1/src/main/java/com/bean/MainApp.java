//Incomplete
// Insert and Delete Operation Done
//Dao not inserted
// MainApp is the DriverFile

package com.bean;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

    //Step 1


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory= configuration.buildSessionFactory();

        do {
            System.out.println("1. INSERT\n2. FETCH\n3. DELETE");
            int ch=Integer.parseInt(br.readLine());
            switch(ch){
                case 1:
                    Session session= sessionFactory.openSession();
                    Transaction transaction= session.beginTransaction();
                    System.out.println("Enter Library Details ");
                    Library library=new Library();
                    library.setId(Integer.parseInt(br.readLine()));
                    library.setlName(br.readLine());
                    System.out.println("Enter no. of Books ");
                    int no_of_book=Integer.parseInt(br.readLine());
                    List<Books> booksList=new ArrayList<>();
                    for(int i=0;i<no_of_book;i++){
                        System.out.println("Enter Book id, name, publisher, price");
                        Books book=new Books();
                        book.setId(Integer.parseInt(br.readLine()));
                        book.setbName(br.readLine());

                        booksList.add(book);
                        session.save(book);
                    }
                    library.setBooks(booksList);
                    int i1= (int) session.save(library);
                    transaction.commit();
                    if(i1>0)
                        System.out.println("Successfully Inserted");
                    else
                        System.out.println("Try Again");
                    break;
                case 2:
                    Session session2=sessionFactory.openSession();
                    Transaction transaction1=session2.beginTransaction();
                    System.out.println("Enter Library Id to delete ");
                    int lid= Integer.parseInt(br.readLine());
                    Query query1=session2.createQuery("delete from Library where l_id=:x");
                    query1.setParameter("x",lid);
                    int i= query1.executeUpdate();
                    transaction1.commit();
                    if(i>0)
                        System.out.println("Success");
                    else
                        System.out.println("Try Again");
                    break;

                default:
                    System.out.println("Wrong Entry");
            }
        }while(true);
    }
}








