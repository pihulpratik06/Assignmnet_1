//Using BufferedReader  
package InputsInJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DetailsDemo1 {

    String name;
    int id;
    double salary;
    String companyName;

    DetailsDemo1() {
        System.out.println("Welcome to Employee Survey");
    }

    void acceptDetails() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Enter name of Employee");
            name = br.readLine();

            System.out.println("Enter ID of Employee");
            id = Integer.parseInt(br.readLine());

            System.out.println("Enter Salary of Employee");
            salary = Double.parseDouble(br.readLine());

            System.out.println("Enter Company Name of Employee");
            br.skip(3);
            companyName = br.readLine();
        } catch (IOException ie) {
            System.out.println("IOException Caught:: Make sure all connection are OK!!");
        }
    }

    void displayDetails() {

        System.out.println("Name of the Employee:" + name);

        System.out.println("Company Name of the Employee:" + companyName);

        System.out.println("ID of the Employee:" + id);

        System.out.println("Salary of the Employee:" + salary);

    }

    public static void main(String[] args) {

        DetailsDemo1 dd = new DetailsDemo1();

        dd.acceptDetails();

        System.out.println("________________________________________");

        dd.displayDetails();

    }
}
        
/*
 * 
 * 
 * 
 * Welcome to Employee Survey 
 * Enter name of Employee Pratik Anant Pihul 
 * Enter ID of Employee 
 * 1
 * Enter Salary of Employee 500000 
 * Enter Company Name of Employee 
 * Coditas
 *  ________________________________________ 
 * Name of the Employee:Pratik
 * Anant Pihul Company Name of the Employee:Coditas 
 * ID of the Employee:1
 *  Salary of the Employee:500000.0
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */