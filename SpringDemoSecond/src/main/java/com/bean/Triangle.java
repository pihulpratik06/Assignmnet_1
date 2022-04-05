package com.bean;
//Triangle
public class Triangle {
    // Three Points
     private  Point pointA;
     private  Point pointB;
     private  Point pointC;

     // Setters and Getters
    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public  void display(){

        System.out.println("**************************Triangle******************************");
        System.out.println("(X,Y)===>("+getPointA().getX()+" "+getPointA().getY()+")");
        System.out.println("(X,Y)===>("+getPointB().getX()+" "+getPointB().getY()+")");
        System.out.println("(X,Y)===>("+getPointC().getX()+" "+getPointC().getY()+")");


    }
}
