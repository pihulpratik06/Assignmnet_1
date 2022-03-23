package com.bean;

public class FullTimeEmp extends Employee {

    private int sal;
    private int extra_hrs;
    private int extra_sal;

    public FullTimeEmp(int id, String name, int sal, int extra_hrs, int extra_sal) {
        super(id, name);
        this.sal = sal;
        this.extra_hrs = extra_hrs;
        this.extra_sal = extra_sal;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getExtra_hrs() {
        return extra_hrs;
    }

    public void setExtra_hrs(int extra_hrs) {
        this.extra_hrs = extra_hrs;
    }

    public int getExtra_sal() {
        return extra_sal;
    }

    public void setExtra_sal(int extra_sal) {
        this.extra_sal = extra_sal;
    }
}
