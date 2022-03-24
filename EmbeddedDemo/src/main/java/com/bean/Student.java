package com.bean;

import javax.persistence.*;

@Entity
@Table(name = "StudentInfo")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "state",column =@Column(name = "State")),
            @AttributeOverride(name = "city",column =@Column(name = "City")),
            @AttributeOverride(name = "country",column =@Column(name = "Country"))
    })
    private Address address;

    public Student( String name, Address address) {

        this.name = name;
        this.address = address;
    }

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}

