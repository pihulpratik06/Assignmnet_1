package com.bean;
//Triangle
public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
    public void display(){
        System.out.println("Triangle");
        System.out.println("Point-1 is "+getP1().getX()+" , "+getP1().getY());
        System.out.println("Point-2 is "+getP2().getX()+" , "+getP2().getY());
        System.out.println("Point-3 is "+getP3().getX()+" , "+getP3().getY());

    }
}
