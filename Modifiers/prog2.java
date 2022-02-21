package Modifiers;

import java.lang.reflect.*;

class Person {
    Person() {
        System.out.println("Default person.");
    }
}

class Student extends Person {
    public String name;
    public int id;
    public float marks;

    public Student() {
        System.out.println("Default Student.");
    }

    public Student(String name) {
        System.out.println("Name is " + name);
    }

    public void show() {
        System.out.println("This is Student");
    }
}

class ReflectionDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student("Pratik Pihul");
        ReflectionDemo obj_r = new ReflectionDemo();
        Class obj_cr = obj_r.getClass();
        Class obj = s.getClass();

        String n = obj.getName();
        String n1 = obj.getCanonicalName();
        String n2 = obj.toGenericString();
        String n3 = obj.getTypeName();
        String n4 = obj.getSimpleName();
        String n5 = obj.getPackageName();

        System.out.println(n);// getname
        System.out.println(n1);// getcanonicalname
        System.out.println(n2);// getgenericstring
        System.out.println(n3);// gettypename
        System.out.println(n4);// getsimplename
        System.out.println(n5);// getpackagename

        System.out.println("******************MODIFIERS**************************");

        int modifier = obj.getModifiers();

        System.out.println(modifier);
        int modifier2Reflection = obj_cr.getModifiers();
        String mod3 = Modifier.toString(modifier2Reflection);
        System.out.println("Modifier of ReflectionDemo " + mod3);
        System.out.println("*****************SUPERCLASS*************");
        Class superClass = obj.getSuperclass();
        System.out.println("Superclass is : " + superClass);
        System.out.println("***************CONSTRUCTORS**************");
        Constructor[] construct = obj.getConstructors();
        for (Constructor c : construct) {
            System.out.println("Constructor is : " + c.getName());

            int modifier2 = c.getModifiers();
            String mod2 = Modifier.toString(modifier2);
            System.out.println("Modifier is: " + mod2);

            System.out.println("Parameters are " + c.getParameterCount());
        }
        System.out.println("***************FIELDS***************");
        Field[] fields = obj.getFields();
        for (Field f : fields) {
            System.out.println("Field is " + f.getName());

            int modifier3 = f.getModifiers();
            System.out.println("Modifier is " + modifier3);
        }
    }
}


/**
 * Output
 *  Default person. 
 * Default Student. Default person.
 *  Name is Pratik Pihul
 * Modifiers.Student Modifiers.
 * Student class Modifiers.
 * Student Modifiers.Student
 * Student Modifiers
 * **************** MODIFIERS**************************
 *  0 Modifier of ReflectionDemo 
 * *********SUPERCLASS************* 
 * Superclass is : class Modifiers.Person
 *************** CONSTRUCTORS************** 
 Constructor is : Modifiers.
 *Student Modifier is:
 * public Parameters are 0 
 * Constructor is : Modifiers.
 * Student Modifier is: public 
 * Parameters are 1 ****************FIELDS*************** 
 * Field is name Modifier is 1
 * Field is id Modifier is 1 
 * Field is marks Modifier is 1
 * 
 * 
 * 
 */