package com.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("1. INSERT\n2. RETRIEVE\n3. UPDATE\n4. DELETE\n5. EXIT");
            int ch=Integer.parseInt(br.readLine());
            switch (ch){
                case 1:
                    System.out.println("Enter Employee id,name,salary");
                    Employee employee=new Employee();
                    employee.setId(Integer.parseInt(br.readLine()));
                    employee.setName(br.readLine());
                    employee.setSalary(Double.parseDouble(br.readLine()));
                    EmployeeDao.insert(employee);
                    break;
                case 2:
                    System.out.println("Enter Employee Id ");
                    int id=Integer.parseInt(br.readLine());
                    Employee employee1=new Employee();
                    EmployeeDao.retrieve(id,employee1);
                    break;
                case 3:
                    System.out.println("Enter Employee Id & Salary ");
                    int id1=Integer.parseInt(br.readLine());
                    double sal=Double.parseDouble(br.readLine());
                    Employee employee2=new Employee();
                    EmployeeDao.update(id1,sal,employee2);
                    break;
                case 4:
                    System.out.println("Enter Employee id");
                    int id2=Integer.parseInt(br.readLine());
                    Employee employee3=new Employee();
                    EmployeeDao.delete(id2,employee3);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");
            }

        }while(true);
    }

}
