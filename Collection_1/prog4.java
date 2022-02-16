//Program 3
//Case 1

package Collection_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee_2 {
    int id;
    String name; 
    int sal;

    public Employee_2(int id, String name,int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public String toString() {
        return "Employee{" + "ID=" + id + ", name='" + name + '\'' + ", Salary='" + sal + '\'' + '}';
    }
}

// SORT BY NAME
class SortByName_1 implements Comparator<Employee_2> {

    public int compare(Employee_2 o1, Employee_2 o2) {
        
        return o1.name.compareTo(o2.name);
    }
}
class SortBySal_1 implements Comparator<Employee_2>{
     
    public int compare(Employee_2 o1, Employee_2 o2) {

        return o1.sal - o2.sal;
    }

}

class ComparatorDemo_1 {
    public static void main(String args[]) {

        ArrayList<Employee_1> list = new ArrayList<Employee_1>();
        list.add(new Employee_1(5, "Shubham", 50000));
        list.add(new Employee_1(3, "Pratik", 14000));
        list.add(new Employee_1(2, "Prachi", 45000));
        list.add(new Employee_1(1, "Sakshi", 60000));
        list.add(new Employee_1(4, "Gavrav", 55000));
        list.add(new Employee_1(4, "Sankalp", 30000));
        list.add(new Employee_1(4, "Nikhil", 14000));
        list.add(new Employee_1(4, "Tejas", 20000));
        list.add(new Employee_1(4, "Atharv", 10000));

        System.out.println("********BEFORE SORTING***********");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("********AFTER SORTING BY NAME***********");
        
        Collections.sort(list, new SortByName());
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).sal>15000){
              System.out.println(list.get(i));
            }
        }

    }
}

/*******
 * Output
 * 
 * ********BEFORE SORTING*********** 
 * Employee{ID=5, name='Shubham',Salary='50000.0'}
 * Employee{ID=3, name='Pratik', Salary='14000.0'}
 * Employee{ID=2, name='Prachi', Salary='45000.0'} 
 * Employee{ID=1, name='Sakshi',Salary='60000.0'} 
 * Employee{ID=4, name='Gavrav', Salary='55000.0'}
 * Employee{ID=4, name='Sankalp', Salary='30000.0'} 
 * Employee{ID=4,name='Nikhil', Salary='14000.0'} 
 * Employee{ID=4, name='Tejas',Salary='20000.0'}
 *  Employee{ID=4, name='Atharv', Salary='10000.0'} 
 * AFTER SORTING BY NAME*********** 
 * Employee{ID=4, name='Gavrav', Salary='55000.0'}
 * Employee{ID=2, name='Prachi', Salary='45000.0'} 
 * Employee{ID=1, name='Sakshi',Salary='60000.0'}
 * Employee{ID=4, name='Sankalp', Salary='30000.0'}
 * Employee{ID=5, name='Shubham', Salary='50000.0'} 
 * Employee{ID=4, name='Tejas',Salary='20000.0'}
 * 
 * 
 * 
 * 
 * 
 */