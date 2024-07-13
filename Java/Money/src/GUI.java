import java.io.*;
import javax.swing.*;

//Author          Date     Comment
//Duncan Armstrong|10/2/18|First Version
public class GUI {
	
	//Start input from keyboard
	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		// Variables
		int half = 0;
		int quarter = 0;
		int dime = 0;
		int nickel = 0;
		int pen = 0;
		String input = "";

		// Start input
		input = JOptionPane.showInputDialog("Enter the amount in change: ");
		int money = Integer.parseInt(input); //Holds the amount

		// Make sure that money is greater than 0.
		if (money > 0) {
			int total = money;// Holds the total.
			half = money / 50;// Calculates the number of half dollars.
			money %= 50;

			quarter = money  / 25;// Calculates the number of quarters.
			money %= 25;

			dime = money / 10;// Calculates the number of dimes.
			money %= 10;

			nickel = money / 5;// Calculates the number of nickels.
			money %= 5;

			pen = money / 1;// Calculates the number of pennies .
			money %= 1;
			
			//Output.
			String out = "Total:  " + total + "¢" + "\n" + "\n" + "Half dollar(s):  " + half + "\n" + "Quarter(s):  "
					+ quarter + "\n" + "Dime(s):  " + dime + "\n" + "Nickel(s):  " + nickel + "\n" + "Penny(ies):  " + pen;
			
			//Display output.
			JOptionPane.showMessageDialog(null, out, "Change", JOptionPane.INFORMATION_MESSAGE);
		}

		// If money is equal to 0.
		else {
			JOptionPane.showMessageDialog(null, "Enter a valid number!", "Change", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
