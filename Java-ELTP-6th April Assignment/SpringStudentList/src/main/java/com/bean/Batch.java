package com.bean;

import java.util.List;

public class Batch {

     private  int batchID;
     private int noOfStud;
     private List<Students> students;

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public int getNoOfStud() {
        return noOfStud;
    }

    public void setNoOfStud(int noOfStud) {
        this.noOfStud = noOfStud;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }
    public  void display(){

        System.out.println("Batch Number::"+getBatchID());
        System.out.println("Number of Studs::"+getNoOfStud());

        List<Students >s=getStudents();
        for(Students v:s){
            System.out.println(v);
        }




    }
}
