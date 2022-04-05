package com.bean;

public class Circle {
    private  float radius;
   private  Point center;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public  void display(){

        System.out.println("**************************Circle******************************");
        System.out.println("Circle Centre::"+getCenter().getX()+" and Radius::"+getCenter().getY());



    }


}
