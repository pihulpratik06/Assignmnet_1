package com.bean;

import java.util.List;

public class Players {

    private  String playerName;
    private  String country;
    private int id;
    List<String> iplTeam;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getIplTeam() {
        return iplTeam;
    }

    public void setIplTeam(List<String> iplTeam) {
        this.iplTeam = iplTeam;
    }

    @Override
    public String toString() {
        return "Players{" +
                "playerName='" + playerName + '\'' +
                ", country='" + country + '\'' +
                ", id=" + id +
                ", iplTeam=" + iplTeam +
                '}';
    }
}
