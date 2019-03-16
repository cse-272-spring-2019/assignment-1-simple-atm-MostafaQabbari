package atm;

import java.util.Scanner;
  

public class Accountsec {
    private boolean valid = false;
    private int number;
    private int cardnum[] = {50000, 60000, 70000};
    Scanner s = new Scanner(System.in);

    public void  account(int x) {
        
       this.number = x;
    }

    public void check() {
       // System.out.println(this.number);
        for (int i = 0; i < cardnum.length; i++) {
            
            if (cardnum[i] == this.number) 
            {   valid = true;
            System.out.println("access");
            break;
            }
            
        }

    }
  public void setvalid(boolean valid)
  {
    this.valid = valid;
  
  
  }
  
  public boolean getvalid()
  {
    return valid;       
          
  }       
  
  
 
  
}
