import java.io.*;


 class InvalidAmountException extends Exception{
       public InvalidAmountException(){
            super();
       }
       public InvalidAmountException(String msg){
            super(msg);
       }
}

 class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException() {
        super();
    }

    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

interface Bank {

    public void deposit(double amount) throws InvalidAmountException;

    public void withDraw(double amount) throws InvalidAmountException, InsufficientBalanceException;

    public void balance();

}

class UrbanBank implements Bank {

    private double accountBalance = 0;
 
    {
        this.accountBalance = 2000;
    }
    // I used Instance block over here

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Exception Caught::Entered invalid amount");

        }
        accountBalance = accountBalance + amount;
      System.out.println("After deposit: "+accountBalance);
    }

    public void  withDraw(double amount) throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Exception Caught::Enter invalid amount");
        }
        if (amount > accountBalance) {
            throw new InsufficientBalanceException(amount + " is not avaialble in your account");

        }
        accountBalance = accountBalance - amount;

        System.out.println("After withdraw amount is:"+accountBalance);
    }

    public void balance() {
        System.out.println("Your Balance is:" + accountBalance);

    }

}



class Main {
    public static void main(String[] args) throws InsufficientBalanceException, InvalidAmountException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
      UrbanBank ub=new UrbanBank();
      
      System.out.println("*********************************************");
      try{
          
          ub.deposit(125);
  
             try{
     
                ub.withDraw(10000);
               
                ub.balance();

             }catch(InsufficientBalanceException e){
       
                System.out.println(e.getMessage());         
        
            }
                
         
        }catch(InvalidAmountException e){
        
            System.out.println(e.getMessage());         
     
  
     
        }
        
     
    System.out.println("*********************************************");
    
    System.out.println("Thankyou Visit Again");
    

    }
}
// Output 
/**
  case 1:
  
  ********************************************* 
        Exception Caught::Entered invalid amount
 *********************************************
     Thankyou Visit Again
  
  
  
 */
/**
 * case 2:
 *********************************************
 * After deposit: 2125.0 
 * After withdraw amount is:1125.0 
 * Your Balance is:1125.0
 *********************************************
 * Thankyou Visit Again 
 * 
 * 
 * 
 */
 


/**
 * case 3:
 *********************************************
 * After deposit: 2125.0 
 * 10000.0 is not avaialble in your account
 *********************************************
 * Thankyou Visit Again
 * 
 * 
 */
