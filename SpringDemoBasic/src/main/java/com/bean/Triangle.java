package com.bean;

public class Triangle {

     private  int h;
     private int v;
     private  String type;



    public void setType(String type) {
        this.type = type;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "h=" + h +
                ", v=" + v +
                ", type='" + type + '\'' +
                '}';
    }
}
