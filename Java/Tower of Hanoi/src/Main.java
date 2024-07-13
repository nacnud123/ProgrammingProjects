import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter in the amount: ");
		int input = in.nextInt();
		Moves move = new Moves(input);
		int startPeg = 1;   // value 1 used to indicate startPeg in output
	    int endPeg = 3;     // value 3 used to indicate endPeg in output
	    int tempPeg = 2;    // value 2 used to indicate tempPeg in output
		move.findMoves(input,startPeg, endPeg, tempPeg);
		move.Print();
		in.close();

	}

}
