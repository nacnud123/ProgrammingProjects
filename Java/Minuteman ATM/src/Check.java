// Duncan Armstrong | 4/23/19 | Made program.
// Duncan Armstrong | 4/24/19 | Fixed up and added comments to program.

public class Check {

  private float balance;
  

   
  public Check() { // Constructor.
	  balance = 0;
  }
    
  public float getBalance() {
	  return balance;
  }

  public void setBalance() { // Set the balance.
	  balance = Customer.Balance;
  }

}