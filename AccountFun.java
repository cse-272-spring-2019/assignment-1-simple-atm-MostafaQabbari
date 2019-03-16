
package atm;


public  class AccountFun implements interfaceATM {

    

    
   private double balance ;
    
    
    @Override
    public double getCurrentBalance() {
        
      System.out.println("your current balance is " +balance );
       return balance;
    }

    @Override
    public void withdraw(double amount) {
       
        if(balance >= amount )
        {
            balance = balance - amount;
           System.out.println("your current balance is " +balance );
        }    
        else 
            System.out.println("not enough money");
    }

    @Override
    public void deposit(double  amount) {
        
        balance = balance + amount;
        System.out.println("your current balance is " +balance );
    }

    @Override
    public String prev() {
     
    }

    @Override
    public String next() {
    
    }
    
}
