package com.bean;
public class Circle {
    private double radius;
    private Point center;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public void display(){
        System.out.println("Circle");
        System.out.println("Radius is "+getRadius());
        System.out.println("Center is "+getCenter().getX()+" , "+getCenter().getY());
    }
}