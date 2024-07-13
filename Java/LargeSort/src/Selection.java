

public class Selection {
	private int[] Nums = new int[10];
	public Selection(int[] nums2) {
		Nums = nums2.clone();
		
	}
	
	public void sort() {
		int n = Nums.length;
		while(n>1) 
		{
			int maxPos = 0;
			for (int k = 1; k < n;k++) 
				if(Nums[k] > Nums[maxPos]) 
					maxPos = k;
				int temp = Nums[maxPos];
				Nums[maxPos] = Nums[n - 1];
				Nums[n - 1] = temp;
				n--;
			}
		
	}
	
}
