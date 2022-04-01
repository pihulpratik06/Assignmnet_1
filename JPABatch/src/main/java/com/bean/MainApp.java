package com.bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FlushModeType;
import javax.persistence.Persistence;
import java.util.List;

public class MainApp {

    public static void main(String[] args) {

          EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("pratik");
            EntityManager entityManager= entityManagerFactory.createEntityManager();
            ((EntityManager) entityManager).setFlushMode(FlushModeType.COMMIT);
            int batch=10;
//INSERT
//        for(int i=0;i<20;i++){
//            Student student=new Student();
//            student.setId(i);
//            student.setName("name_"+i);
//            entityManager.persist(student);
//            if(i%batch==0 && i>0){
//                entityManager.flush();
//                entityManager.clear();
//            }
//        }
            List<Student> students=entityManager.createQuery("from Student",Student.class).getResultList();
            entityManager.getTransaction().begin();
            //UPDATE
//        for(int i=0;i<students.size();i++){
//            Student student= students.get(i);
//            if(student.getId()%2==0){
//                student.setName(student.getName()+"_"+100);
//                student=entityManager.merge(student);
//                entityManager.persist(student);
//            }
//            if(i%batch==0 && i>0){
//                entityManager.flush();
//                entityManager.clear();
//            }
//        }

            //DELETE
            for(int i=0;i< students.size();i++){
                Student student= students.get(i);

                if(student.getId()%2!=0){
                    entityManager.remove(entityManager.contains(student) ? student : entityManager.merge(student));
                }
                if(i%batch==0 && i>0){
                    entityManager.flush();
                    entityManager.clear();
                }

            }
            entityManager.getTransaction().commit();
            entityManager.close();
            entityManagerFactory.close();

        }

    }


