package InputsInJava;
import java.io.Console;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DetailsDemo2 {
    String name;
    int id;
    double salary;
    String companyName;

    void acceptDetails() throws IOException {
        Console c = System.console();

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Name of the Employee: ");
        name = c.readLine();
        System.out.println("Enter Id");
        id = Integer.parseInt(c.readLine());
        br.skip(4);
        System.out.println("Enter Project");
        companyName = c.readLine();
        System.out.println("Enter Salary");
        salary = Float.parseFloat(c.readLine());
    }

    void displayDetails() {

        System.out.println("Name of the Employee:" + name);

        System.out.println("Company Name of the Employe:" + companyName);

        System.out.println("ID of the Employee:" + id);

        System.out.println("Salary of the Employee:" + salary);

    }

    public static void main(String[] args) throws IOException {

        DetailsDemo2 dd_2 = new DetailsDemo2();
        dd_2.acceptDetails();
        System.out.println("______________________________");
        dd_2.displayDetails();

    }
}
/*
 * 
 * 
 * 
 * 
 * 
 * 
 * Welcome to Employee Survey
 *  Enter name of Employee 
 * Pratik Anant Pihul 
 * Enter ID of Employee 
 * 1 
 * Enter Salary of Employee 500000 
 * Enter C
 * ompany Name of Employee
 * Coditas
 *  ________________________________________ 
 * Name of the Employee:Pratik Anant Pihul 
 * Company Name of the Employee:Coditas
 *  ID of the Employee:1 
 * Salary of the Employee:500000.0
 * 
 * 
 * 
 */
