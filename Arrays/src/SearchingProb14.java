//Find a Fixed Point (Value equal to index) in a given array
//Given an array of n distinct integers sorted in ascending order, write a function that returns a Fixed Point in the array, if there is any Fixed Point present in array, else returns -1. 
//Fixed Point in an array is an index i such that arr[i] is equal to i. Note that integers in array can be negative.
public class SearchingProb14 {
	
	public static void main(String[] arg)
	{
		int[] arr = {-10, -1, 0, 3 , 10, 11, 30, 50, 100};
		int result = binarySearch(0, arr.length-1, arr);
		if(result != 1)
			System.out.println("Fixed point not found!");
		
	}
	
	static int binarySearch(int l, int h, int[] arr)
	{
		if(h < l)
			return -1;
		int mid = (l + h)/2;
		if(mid == arr[mid])
		{
			System.out.printf("Index %d and value %d", mid, arr[mid]);
			return 1;
		}
		else if(mid > arr[mid])
		{
			return binarySearch(mid+1, h, arr);
		}
		else
		{
			return binarySearch(l, mid-1, arr);
		}
	}

}
