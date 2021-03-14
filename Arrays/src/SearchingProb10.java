//Find Ceiling and floor in a sorted array
//Given a sorted array and a value x, the ceiling of x is the smallest element in array greater than or equal to x, and 
//the floor is the greatest element smaller than or equal to x. Assume than the array is sorted in non-decreasing order.
public class SearchingProb10 {
	
	public static void main(String[] arg)
	{
		int[] arr = {1,2,8,10,10,12,19};
		int x = 20;
		int ceil=0, floor=0;
		if(x < arr[0])
		{
			System.out.printf("Floor doesn't exist in an array but Ceil is %d",arr[0]);
			return;
		}
		
		if(x > arr[arr.length -1])
		{
			System.out.printf("Ceil doesn't exist in an array but Floor is %d", arr[arr.length -1]);
			return;
		}	
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<x)
			{
				floor = arr[i];
			}
			else if(arr[i] == x)
			{
				ceil= arr[i];
				floor =arr[i];
				break;
			}
			else
			{
				ceil = arr[i];
				break;
			}
		}
		
		System.out.printf("Ceil and floor are %d and %d",ceil, floor);
	}

}
