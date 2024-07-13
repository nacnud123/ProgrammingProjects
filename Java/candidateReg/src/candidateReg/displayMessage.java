package candidateReg;

import java.io.*;
import java.util.Scanner;

import javax.swing.*;

public class displayMessage {

	private String[] names;
	private Scanner input = new Scanner(System.in);
	private int candidateInt;
	private String candidateIn;
	private int pos;
	private String output;
	private String strFileContents;

	public displayMessage() {
		getNames();
		input.close();

	}

	public void getNames() {
		File file = new File("candidate name.txt");
		BufferedInputStream bin = null;

		try {
			FileInputStream fin = new FileInputStream(file);

			bin = new BufferedInputStream(fin);

			byte[] contents = new byte[1024];

			int bytesRead = 0;
			String strFileContents = null;

			while ((bytesRead = bin.read(contents)) != -1) {
				strFileContents = new String(contents, 0, bytesRead);
			}
			if (strFileContents == null) {
				System.out.println("There is no content in candidate name.txt add some then try again");
			}else {
				names = strFileContents.split("\n");
				for (int i = 0; i < names.length; i++) {
					names[i] = names[i].toString().replaceAll("\n", "").replaceAll("\r", "");
				}
				Output();
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("File not found" + e);
		} catch (IOException ioe) {
			System.out.println("Exception while reading the file " + ioe);
		}
	}
	

	public void Output() {
		for (int i = 0; i < names.length; i++) {
			System.out.print(i + 1 + ". " + names[i] + "\n");
		}
		System.out.print("Enter the number of the candidate you want to see: ");

		candidateIn = input.nextLine();
		candidateIn = candidateIn.toLowerCase();

		try {
			candidateInt = Integer.parseInt(candidateIn);

			File file = new File(names[candidateInt - 1].replaceAll("\n", "").replaceAll("\r", "") + ".txt");
			BufferedInputStream bin = null;

			try {
				FileInputStream fin = new FileInputStream(file);

				bin = new BufferedInputStream(fin);

				byte[] contents = new byte[1024];

				int bytesRead = 0;
				String strFileContents = null;

				while ((bytesRead = bin.read(contents)) != -1) {
					strFileContents = new String(contents, 0, bytesRead);
				}
				
				output = "\n";
				output += names[candidateInt - 1] + " says: " + strFileContents.replaceAll("\n", "").replaceAll("\r", "");
				setOutputInt(output);
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found" + e);
			} catch (IOException ioe) {
				System.out.println("Exception while reading the file " + ioe);
			}

		} catch (NumberFormatException j) {

			for (int i = 0; i < names.length; i++) {
				if (names[i].toLowerCase().equals(candidateIn)) {
					pos = i;
				}
			}
			File file = new File(names[pos].replaceAll("\n", "").replaceAll("\r", "") + ".txt");
			BufferedInputStream bin = null;

			try {
				FileInputStream fin = new FileInputStream(file);

				bin = new BufferedInputStream(fin);

				byte[] contents = new byte[1024];

				int bytesRead = 0;

				while ((bytesRead = bin.read(contents)) != -1) {
					strFileContents = new String(contents, 0, bytesRead);
				}
				
				output = "\n";
				output += names[pos] + " says: " + strFileContents.replaceAll("\n", "").replaceAll("\r", "");
				setOutputStr(output);
				
			} catch (FileNotFoundException e) {
				System.out.println("File not found" + e);
			} catch (IOException ioe) {
				System.out.println("Exception while reading the file " + ioe);
			}

		}
		

	}
	public String setOutputInt(String output) {
		JOptionPane.showMessageDialog(null, output , names[candidateInt - 1] + "'s message!", JOptionPane.INFORMATION_MESSAGE);
		return output;
	}
	public String setOutputStr(String output) {
		JOptionPane.showMessageDialog(null, output , names[pos] + "'s message!", JOptionPane.INFORMATION_MESSAGE);
		return output;
	}

}
