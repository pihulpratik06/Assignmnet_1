//Question 1 
//Case 2
package InputsInJava;

import java.util.Scanner;

class Students_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String name;
        int ID;
        double marks;
        
        
        System.out.println("Enter your ID :");
        ID = sc.nextInt();
        
        System.out.println("Enter your percentage :");
        marks = sc.nextDouble();
        
        
        
        System.out.println("Enter your Name :");
        sc.nextLine();
        name = sc.nextLine();
        
        
        System.out.println("Name of the Students:" + name + " ID of the student is:" + ID + " Marks of the students is:" + marks);
               

    }

}

/*
 * Output
 * 
 * Enter your ID : 2 Enter your percentage : 78.98 Enter your Name : Pratik
 * Anant Pihul Name of the Students:Pratik Anant Pihul ID of the student is:2
 * Marks of the students is:78.98
 * 
 * 
 */