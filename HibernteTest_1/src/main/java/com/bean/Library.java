package com.bean;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "LibraryDetails")
public class Library {
    @Id
    private int id;
    private  String lName;
    private  String add;

     @OneToMany
     private List<Books> list;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }
}
