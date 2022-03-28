package com.bean;

import java.util.ArrayList;
import java.util.List;

public class FilmDetails {

     private  int id;
     private  String name;

   List<Songs> songs;


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

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }
}
