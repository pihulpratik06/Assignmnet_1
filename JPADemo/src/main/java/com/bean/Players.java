package com.bean;

import javax.persistence.*;

@Entity
@Table(name = "PlayersInfo")
public class Players {

     @GeneratedValue(strategy = GenerationType.AUTO)
     @Id
     private int id;

     @Column(name = "PlayerName")
     private  String name;

     @Column(name = "TeamName")
     private  String teamName;

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

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                '}';
    }
}
