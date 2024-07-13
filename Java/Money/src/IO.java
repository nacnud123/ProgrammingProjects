import java.io.*;
import java.util.Scanner;

//Author           Date    Comment
//Duncan Armstrong|10/2/18|First Version
public class IO {

	public static void main(String[] args) {
		// Variables
		int half = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int pen = 0;
		
		//Input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter in the amount: ");
		int money = in.nextInt();// Holds the amount
		int total = money;// Holds the total.

		half = money / 50;// Calculates the number of half dollars.
		money -= half * 50;

		quarter = money / 25;// Calculates the number of quarters.
		money -= quarter * 25;

		dime = money / 10;// Calculates the number of dimes.
		money -= dime * 10;

		nickel = money / 5;// Calculates the number of nickels.
		money -= nickel * 5;

		pen = money / 1;// Calculates the number of pennies .
		money -= pen * 1;

		// Output
		System.out.println("Total: " + total);
		System.out.println();
		System.out.println("Half dollar: " + half);
		System.out.println("Quarter: " + quarter);
		System.out.println("Dime: " + dime);
		System.out.println("Nickel: " + nickel);
		// If statements that prints different spellings of pennies depending of the
		// amount.
		if (pen == 1) {
			System.out.println("Penny: " + pen);
		} else {
			System.out.println("Pennies: " + pen);
		}

	}

}
