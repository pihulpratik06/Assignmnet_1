package com.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="BooksInfo")
public class Books {



    @Id
    private  int id;

    @Column(name="BookName")
    private  String bName;

     @Column(name="AuthorName")
    private  String aName;



    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
}
