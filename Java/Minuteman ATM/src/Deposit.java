// Duncan Armstrong | 4/23/19 | Made program.
// Duncan Armstrong | 4/24/19 | Fixed up and added comments to program.

public class Deposit {

  private float funds;

  private float newAmount;
    
  public Deposit(Float fundsIn, float currAmount) { // Constructor .
	  funds = fundsIn;
	  newAmount = currAmount;
  }
  public void addToBalance() { // Add the the current balance.
	  
	  newAmount += funds;
  }

  public Float getBalance() { // Getter.
	  return newAmount;
  }

}