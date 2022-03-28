package com;

import javax.persistence.*;
import java.util.Map;


public class IplTeam {

    private int tid;

    private String name,owner;


    private Map<String,Players> playersMap;

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Map<String, Players> getPlayersMap() {
        return playersMap;
    }

    public void setPlayersMap(Map<String, Players> playersMap) {
        this.playersMap = playersMap;
    }
}
