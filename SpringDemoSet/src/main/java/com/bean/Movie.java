package com.bean;

;

public class Movie {
    private  int id;
    private  String movieName;
    private  String actor, actress;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }




    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movieName='" + movieName + '\'' +
                ", actor='" + actor + '\'' +
                ", actress='" + actress + '\'' +
                '}';
    }
}
