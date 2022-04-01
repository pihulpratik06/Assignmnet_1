package com.bean;


import com.bean.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDao {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");

    public static void insert(Employee e) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        em.close();
    }

    public static void update(int id, double salary, Employee e) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        e = em.find(Employee.class, id);
        e.setSalary(salary);
        em.getTransaction().commit();
        em.close();
    }

    public static void retrieve(int id, Employee e) {
        EntityManager em = emf.createEntityManager();
        e = em.find(Employee.class, id);
        System.out.println("Id " + e.getId());
        System.out.println("Name " + e.getName());
        System.out.println("Salary " + e.getSalary());
        em.close();
    }

    public static void delete(int id, Employee e) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        e = em.find(Employee.class, id);
        em.remove(e);
        em.getTransaction().commit();
        em.close();
    }

}