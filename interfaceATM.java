

package atm;


public interface interfaceATM {
    
    
//Returnsthe current balance in string format
public double getCurrentBalance();
//withdraws from current balance and updates it
public void withdraw(double amount);
//adds to the current balance and updates it
public void deposit(double amount);
//returns the prevtransaction in String format, or Null if no more history
public String prev();
//returns the next transaction in String format, or Null if no morehistory
public String next();
}
    
    
    

