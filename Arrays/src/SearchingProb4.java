// Find the only repetitive element between 1 to n-1
public class SearchingProb4 {
	public static void main(String[] arg)
	{
		int[] arr = {1,1,2,3,4,5,6};
		int sum =0, sigma=0;
		int n = arr.length;
		for(int i =0; i<n; i++)
			sum = sum + arr[i];
		sigma = n*(n-1)/2;
		
		System.out.println("rep element is " + (sum - sigma));
	}

}
