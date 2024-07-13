import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void sort(int[] nums)
	  {
	    recursiveSort(nums, 0, nums.length - 1);
	  }
	
	  // Recursive helper method: sorts a[from], ..., a[to]
	  private static void recursiveSort(int[] nums, int from, int to)
	  {
	    if (from >= to)
	      return;
	
	    // Choose pivot a[p]:
	    int p = (from + to ) / 2;
	      // The choice of the pivot location may vary:
	      //   you can also use p = from or p = to or use
	      //   a fancier method, say, the median of the above three.
	
	    // Partition:
	    int i = from;
	    int j = to;
	    while (i <= j)
	    {
	      if (nums[i] <= nums[p])
	        i++;
	      else if (nums[j] >= nums[p])
	        j--;
	      else
	      {
	        swap (nums, i, j);
	        i++;
	        j--;
	      }
	    }
	
	    // Finish partitioning:
	    if (p < j)    // place the pivot in its correct position
	    {
	      swap (nums, j, p);
	      p = j;
	    }
	    else if (p > i)
	    {
	      swap (nums, i, p);
	      p = i;
	    }
	
	    // Sort recursively:
	    recursiveSort(nums, from, p - 1);
	    recursiveSort(nums, p + 1, to);
	  }
	
	  private static void swap (int[] nums, int i, int j)
	  {
	    Integer temp = nums[i]; nums[i] = nums[j]; nums[j] = temp;
	  }
}


