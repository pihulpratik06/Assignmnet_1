package com.bean;
import java.util.Set;
public class Director {

    private int id;
    private String directorName;
    Set<Movie> movieSet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public Set<Movie> getMovieSet() {
        return movieSet;
    }

    public void setMovieSet(Set<Movie> movieSet) {
        this.movieSet = movieSet;
    }

    public void display() {
        System.out.println("Name of Director::" + getDirectorName());


        Set<Movie> s = getMovieSet();

        for(Movie m:s){
            System.out.println(m);
        }
    }
}




