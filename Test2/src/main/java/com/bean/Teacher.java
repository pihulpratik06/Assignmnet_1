package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeacherInfo")
public class Teacher {

    @Id
    private int id;
    @Column(name = "TeacherName")
    private  String name;
    @Column(name="TeacherSalary")
    private  double sal;

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

    public double getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}
