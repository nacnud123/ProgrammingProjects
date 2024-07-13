import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int[] Nums = new int[2147483647]; // ArrayList that holds the random numbers.
		for (int i = 0; i < 2147483647; i++) { // For loop that populates the ArrayList with random numbers.
			Random rand = new Random();
			Nums[i] = rand.nextInt(100);
		}
		MergeSort merg = new MergeSort();
		
		long tStart = System.currentTimeMillis();
		
		merg.mergesort(Nums, 0, Nums.length - 1);
		
		long tEnd = System.currentTimeMillis(); 
		
		long tDelta = tEnd - tStart; 
		System.out.println("Elapsed Time (in Milliseconds): " + tDelta);
		double tSecDelta = tDelta/1000;
		System.out.println("Elapsed Time (in seconds): " + tSecDelta);

		


	}

}
