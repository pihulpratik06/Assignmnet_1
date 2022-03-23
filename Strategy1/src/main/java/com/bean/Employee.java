package com.bean;

import javax.persistence.*;

@Entity
@Table(name="EmployeeTPC")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

     @Column(name="NameOfEmployee")
    private String name;

    //Constructor

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;

    }

    //Setter and Getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

