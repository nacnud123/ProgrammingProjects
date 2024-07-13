import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	
	public MergeSort() {
		
	}
	
	public static void mergesort(int[] input, int start, int end) 
	{ 
		// split the array and sort each segment 
		int mid = (start + end) / 2; 
		if (start < end) 
		{ 
			mergesort(input, start, mid); 
			mergesort(input, mid + 1, end); 
		} 
		
		// merge the sorted segments 
		int i = 0, 
		first = start, last = mid + 1; 
		Integer[] tmp = new Integer[end - start + 1]; 
		
		while (first <= mid && last <= end) 
		{ 
			tmp[i++] = input[first] < input[last] ? input[first++] : input[last++]; 
		} 
		
		while (first <= mid) 
		{ 
			tmp[i++] = input[first++]; 
			
		} 
		
		while (last <= end) 
		{ 
			tmp[i++] = input[last++]; 
		} 
		
		i = 0; 
		while (start <= end) 
		{ 
			input[start++] = tmp[i++]; 
		} 
	}
}