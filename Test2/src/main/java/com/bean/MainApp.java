//80 Percent done
//Able to fetch min sal
//Getting Exception for fetching name

package com.bean;

import javax.persistence.*;
import java.util.List;




              public class MainApp {
                     public static void main(String[] args) {

                             Teacher teacher=new Teacher();

                             teacher.setId(2);
                             teacher.setName("Pradnya");
                             teacher.setSal(200);




                            EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pratik");
                            EntityManager entityManager = entityManagerFactory.createEntityManager();

                            Query query = entityManager.createQuery("select MIN(t.sal) from Teacher t");
                            Double res = (Double) query.getSingleResult();
                            System.out.println(res);


                            entityManager.persist(teacher);
                            System.out.println(teacher);


                            EntityTransaction transaction= entityManager.getTransaction();






                            Query query1 = entityManager.createQuery("select salary from Teacher t where t.name LIKE 'Arohi'");
                            Double res1 = (Double) query1.getSingleResult();
                            System.out.println(res1);

                            Query query2 = entityManager.createQuery("Select t.tname from Teacher t where t.sal between 120 and 160");
                            List<String> res2 = query2.getResultList();
                            System.out.println(res2);


                            transaction.begin();
                            transaction.commit();
                            entityManager.close();




                     }

              }