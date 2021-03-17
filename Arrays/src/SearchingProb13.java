//Find the two repeating elements in a given array
//Desc: You are given an array of n+2 elements. All elements of the array are in range 1 to n.
//And all elements occur once except two numbers which occur twice. Find the two repeating numbers. 
public class SearchingProb13 {
	
	public static void main(String[] arg)
	{
		int[]arr = {1,3,2,4,6,5,1,3};
		//finding the sum of an array
		int sum=0,prod=1;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		//finding the prod of array elements
		for(int i=0; i<arr.length; i++)
		{
			prod = prod*arr[i];
		}
		
		int n = arr.length -2;
		int sumOfN = n*(n+1)/2;
		//finding factorial
		int factOfN = findFact(n);
		int xplusy = sum - sumOfN;
		int xintoy = prod/factOfN;
		int xminusy = (int) Math.sqrt(xplusy * xplusy - 4 * xintoy);
		int x=0, y=0;
		x = (xplusy + xminusy)/2;
		y = (xplusy - xminusy)/2;
		
		System.out.printf("the two repeating elements are %d and %d", x, y);
	}
	
	public static int findFact(int n)
	{
		int fact =1;
		for(int i = n ; i>0 ; i--)
		{
			fact = fact * i;
		}
		return fact;
	}

}
