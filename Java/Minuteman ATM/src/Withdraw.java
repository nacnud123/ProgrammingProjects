// Duncan Armstrong | 4/23/19 | Made program.
// Duncan Armstrong | 4/24/19 | Fixed up and added comments to program.

public class Withdraw {

  private float cash;

  private float withdrawAmount;
  

  
  public Withdraw(float withdrawIn) { // Constructor
	  withdrawAmount = withdrawIn;
	  cash = Customer.Balance;
  }

  public void takeMoneyOut() { // Take money out of their account.
	  cash -= withdrawAmount;
	  System.out.printf("You took out $%.2f",withdrawAmount);
	  System.out.println();
	  if (cash < 0) { // Checks if the account balance is 0.
		  System.out.println("You cannot take out any more.");
		  cash = 0;
	  }
	  System.out.printf("Your new balance is $%.2f",cash);

  }

  public void setBalance() { // Updates the balance.
	  Customer.Balance = cash;
  }
  
  public float getBalance() {
	  return Customer.Balance;
  }

}