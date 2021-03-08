import java.util.Arrays;

//Given an array A[] and a number x, check for pair in A[] with sum as x
public class SearchingProb1 {
	public static void main(String[] arg)
	{
		int arr[] = {0,1,3,5,6,7,8};
		int num = -1;
		checkPair(arr, num);
	}
	
	static void checkPair(int[] arr, int num)
	{
		int f = 0;
		int l = arr.length-1;
		Arrays.sort(arr);
		while(f < l)
		{
			if(arr[f] + arr[l] == num)
			{
				System.out.printf("Sum found as %d and %d", arr[f], arr[l]);
				return;
			}
			else if(arr[f] + arr[l] < num)
			{
				++f;
			}
			else
			{
				--l;
			}
		}
		System.out.println("Sum not found!!");
	}

}
