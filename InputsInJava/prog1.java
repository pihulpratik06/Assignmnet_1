//Question 1 
// Case 1
package InputsInJava;

import java.util.Scanner;

class Students {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int ID;
        double marks;
        System.out.println("Enter your Name :");
        name = sc.nextLine();
        
        System.out.println("Enter your ID :");
        ID = sc.nextInt();
        
        System.out.println("Enter your percentage :");
        marks = sc.nextDouble();

        System.out.println(
                "Name of the Students:" + name + " ID of the student is:" + ID + " Marks of the students is:" + marks);

    }

}


/*
 * Output
 * 
 * 
 * 
 * Enter your Name : Pratik Enter your ID : 3 Enter your percentage : 98.66 Name
 * of the Students:Pratik ID of the student is:3 Marks of the students is:98.66
 * 
 */