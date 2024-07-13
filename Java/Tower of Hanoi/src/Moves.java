import java.util.*;

public class Moves {
	private int disk;
	private int total;
	public Moves(int input) {
		disk = input;
		
	}
	
	public void findMoves(int m, int sourcePeg, int destinationPeg, int tempPeg) {
		if(m == 1) {
			System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );
	         return;
		}
		findMoves(m -1, sourcePeg, tempPeg, destinationPeg);
		
		System.out.printf( "\n%d --> %d", sourcePeg, destinationPeg );
		
		findMoves( m - 1, tempPeg, destinationPeg, sourcePeg );
		
	}
	public void Print() {
		total = (int) (Math.pow(2, disk) - 1);
		System.out.println();
		System.out.println("---------");
		System.out.println("Total amout of moves: " + total);
	}
}
