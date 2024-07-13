
public class Insertion {

	private int[] Nums = new int[10];
	public Insertion(int[] nums2) {
		Nums = nums2.clone();
		
	}
	
	public void sort()
	{
		for(int k = 1; k < Nums.length; k++) 
		{
			int temp = Nums[k];
			int i = k;
			while( i > 0 && Nums[i - 1] > temp) 
			{
				Nums[i] = Nums[i - 1];
				i--;
			}
			Nums[i] = temp;
		}
		System.out.println();
		System.out.println();
		System.out.print("Insertion: ");
		for(int j = 0; j < Nums.length; j++) {
			System.out.print(Nums[j] + " ");
		}
		
	}
	
	
}
