package com.bean;

import javax.persistence.*;


@Entity
@Table(name="BatsmanData1")
public class Players {

    //POJO
    //Private Var
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Column(name = "PlayerName")
    private String playerName;

    @Column(name = "TeamName")
    private String team;

    @Column(name = "Average")
    private float avg;

    @Column(name = "StrikeRate")
    private float strike_rate;


   //Public
    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Players{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", team='" + team + '\'' +
                ", avg=" + avg +
                ", strike_rate=" + strike_rate +
                '}';
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    public float getStrike_rate() {
        return strike_rate;
    }

    public void setStrike_rate(float strike_rate) {
        this.strike_rate = strike_rate;
    }
}
