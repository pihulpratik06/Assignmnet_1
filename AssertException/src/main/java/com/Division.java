//AssertException

package com;

public class Division{

    public int div(int a,int b){

        if(b==0){
             throw  new ArithmeticException("Zero:::");
        }

        return  a/b;


    }
}

class Main{
    public static void main(String[] args) {

        Division division=new Division();

         int div=division.div(25,5);
        System.out.println(div);



    }
}