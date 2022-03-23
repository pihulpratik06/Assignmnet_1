//Using Annotation

package com.bean;


import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "TPSPartTime")
@PrimaryKeyJoinColumn(name="ID")
public class PartTimeEmp  extends  Employee{

     private int no_of_hrs;
     private  int hrs_per_sal;


    public PartTimeEmp(int id, String name, int no_of_hrs, int hrs_per_sal) {
        super(id, name);
        this.no_of_hrs = no_of_hrs;
        this.hrs_per_sal = hrs_per_sal;

    }

    public int getNo_of_hrs() {
        return no_of_hrs;
    }

    public void setNo_of_hrs(int no_of_hrs) {
        this.no_of_hrs = no_of_hrs;
    }

    public int getHrs_per_sal() {
        return hrs_per_sal;
    }

    public void setHrs_per_sal(int hrs_per_sal) {
        this.hrs_per_sal = hrs_per_sal;
    }
}
