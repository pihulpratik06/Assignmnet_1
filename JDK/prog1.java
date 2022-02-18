//Problem 1
package JDK;



abstract class Addition {

  abstract void add(int... args);    
}
class Vargs_Addtion extends Addition{ 
    @Override  
    void add(int ...args){
               
             int sum=0;

             for (int i : args) {
                   sum=sum+i;
             }
             
             System.out.println("Sum is:"+sum);
            


        }
}
class MainDemo{ 
      public static void main(String[] args) {
            
        Vargs_Addtion obj=new Vargs_Addtion();

        obj.add(1,3);
        obj.add(1,3,35,5);
        
        // Tried for more Arguments 
        obj.add(1,3,3,4,32);
        obj.add(1,3,4,5,6,7,8);
        obj.add(1,3,4,5,6,7,8,6,7,4);
        obj.add(1,3,4,5,6,7,8,6,7,4,4,3,2,10);
        
    }
}
 /*
  * OutPut
  * 
  * Sum is:4 
    Sum is:44
    Sum is:43
    Sum is:34 
    Sum is:51 
    Sum is:70
  * 
  * 
  * 
  * 
  */



