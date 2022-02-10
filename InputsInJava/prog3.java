//Using Scanner class
package InputsInJava;

import java.util.Scanner;

class DetailsDemo {
  
     

    String name;
    int id;
    double salary;
    String companyName;

    DetailsDemo(){
         System.out.println("Welcome to Employee Survey");
    }

    void acceptDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of Employee");
        name = sc.nextLine();
       
        System.out.println("Enter ID of Employee");
        id = sc.nextInt();
       
        System.out.println("Enter Salary of Employee");
        salary = sc.nextDouble();
       
        System.out.println("Enter Company Name of Employee");
        sc.nextLine();
        companyName = sc.nextLine();

    }

    void displayDetails() {
    
        
            System.out.println("Name of the Employee:"+name);
        
           System.out.println("Company Name of the Employee:"+companyName);
        
           System.out.println("ID of the Employee:"+id);
           
           System.out.println("Salary of the Employee:"+salary);
          
          
         
    }

    public static void main(String[] args) {
      
        DetailsDemo dd = new DetailsDemo();
 
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
 *  Enter name of Employee 
 * Pratik Anant Pihul 
 * Enter ID of Employee 
 * 1 Enter 
 * Salary of Employee 500000 
 * Enter Company Name of Employee
 * Coditas
 *  ________________________________________ 
 * Name of the Employee:Pratik Anant Pihul 
 * Company Name of the Employee:Coditas 
 * ID of the Employee:1 
 * Salary of the Employee:500000.0
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */