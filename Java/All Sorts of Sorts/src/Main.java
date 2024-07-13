import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Time time = new Time();
		
		int[] Nums = new int[10]; // ArrayList that holds the random numbers.
		for (int i = 0; i < 10; i++) { // For loop that populates the ArrayList with random numbers.
			Random rand = new Random();
			Nums[i] = rand.nextInt(100);
		}
		Selection sel = new Selection(Nums);
		sel.sort();

		Insertion In = new Insertion(Nums);
		In.sort();

		MergeSort ob = new MergeSort();
		ob.sort(Nums, 0, Nums.length - 1);
		
		System.out.println();
		System.out.println();
		System.out.print("Mergesort Array: ");
		ob.printArray(Nums);

		
		QuickSort obj = new QuickSort();
		obj.sort(Nums);

		System.out.print("Quick Sort array: ");
		ob.printArray(Nums);

	}

}
