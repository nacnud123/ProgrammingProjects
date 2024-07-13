// Duncan Armstrong | 4/23/19 | Made program.
// Duncan Armstrong | 4/24/19 | Fixed up and added comments to program.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Customer.setName(); // Set the name in customer
		Customer.setId(); // Set the Id in customer

		String Do = ""; // Holds the input
		Scanner in = new Scanner(System.in); // Get input

		float Balance = Customer.Balance;

		// Prints out the name and id of the customer.
		System.out.printf("Name: %s", Customer.getName());
		System.out.println();
		System.out.printf("Your id is: %d", Customer.getId());
		System.out.println();
		
		while (Do.toLowerCase() != "quit") { // Runs until the user quits
			
			System.out.println();
			System.out.print("Please enter \n1.Check \n2.Deposit \n3.Withdraw \n4.Quit \nHere:");
	        BufferedReader reader =
	                   new BufferedReader(new InputStreamReader(System.in));
	        try {
				Do = reader.readLine();
				
			} catch (IOException e) {
				System.out.println("Something went wrong.");
				e.printStackTrace();
			}
			Do = Do.toLowerCase();
			
			
			if (Do.equals("check") || Do.equals("1")) { // Runs check class if user wants to check their information.

				System.out.println();
				Check amount = new Check();
				amount.setBalance();
				System.out.printf("You have: $%.2f in your account", amount.getBalance());
				System.out.println();

			}
			if (Do.equals("deposit") || Do.equals("2")) { // Runs deposit class if user wants to deposit money.

				float Add = 0;
				System.out.print("Enter the amount you would like to add:");
				Add = in.nextFloat();
				System.out.println();
				
				Deposit dep = new Deposit(Add, Balance);
				dep.addToBalance();
				Customer.Balance = dep.getBalance();
				System.out.printf("You added $%.2f to your account you now have $%.2f in your account.", Add, Balance);
				System.out.println();
				
			}
			if (Do.equals("withdraw") || Do.equals("3")) { // Runs withdraw class if user wants to withdraw money.

				System.out.print("Enter the amount you would like to withdraw:");
				Withdraw with = new Withdraw(in.nextFloat());
				with.takeMoneyOut();
				with.setBalance();
				System.out.println();

			}
			if (Do.equals("quit") || Do.equals("4")) { // Quits the program.
				System.out.println();
				System.out.println("Bye");
				in.close();
				System.exit(0);
			}

		}
		
	}

}
