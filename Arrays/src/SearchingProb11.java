import java.util.Arrays;

//Check if an array has a majority element
//A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element). 
public class SearchingProb11 {
	
	public static void main(String[] arg)
	{
		int[] arr = {3,3,4,2,4,4,2,4,4,4};
		Arrays.sort(arr);
		int prev =arr[0];
		int count = 1;
		for(int i=1; i< arr.length; i++)
		{
			if(prev == arr[i])
			{
				count++;
			}
			else
			{
				count = 1;
			}
			prev = arr[i];
			if(count > arr.length/2)
			{
				System.out.printf("Majority element is %d", prev);
				return;
			}
		}
		System.out.println("Majority element not found!");
		
	}

}
