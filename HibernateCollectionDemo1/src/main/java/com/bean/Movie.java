package com.bean;

import java.util.HashSet;
import java.util.Set;

public class Movie {

    private int id;
    private String name;
    private Set<Director> directors;

    public Movie(){
         id=0;
         name="";
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

    public Set<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Director> directors) {
        this.directors = directors;
    }
}