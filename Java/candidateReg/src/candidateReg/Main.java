package candidateReg;

import java.io.*;
import java.util.Scanner;

public class Main {

	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);// Get input
		String doIn = "";
		System.out.println("Type 'new' to add a new candidate. ");
		System.out.println("Type 'see' to see a candidates message. ");
		System.out.println("Type 'exit' to exit the program. ");
		System.out.print("What do you want to do: ");
		doIn = in.nextLine(); // Hold input
		switch (doIn.toLowerCase()) {
		case "new":
			File file = new File("candidate name.txt");
			Input out = new Input();

			out.setName();
			out.setMessage();

			try {
				String Name = out.getName();
				String Message = out.getMessage();

				File namedFile = new File(Name + ".txt");

				if (!file.exists()) {
					file.createNewFile();
				}

				if (!namedFile.exists()) {
					namedFile.createNewFile();
				}

				FileWriter fw = new FileWriter(file, true);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(Name);
				bw.newLine();

				bw.close();

				FileWriter fwNamed = new FileWriter(namedFile, true);

				BufferedWriter bwNamed = new BufferedWriter(fwNamed);

				bwNamed.write(Message);
				bwNamed.close();

				System.out.println("\nSuccessfully written to the file");

				System.out.println();

			}

			catch (IOException ioe) {
				System.out.println("Exception occurred:");
				ioe.printStackTrace();
			}
			break;
		case "see":
			System.out.println();
			displayMessage Out = new displayMessage();
			break;
		case "exit":
			break;
		}
		in.close();
		System.exit(0);

	}
}
