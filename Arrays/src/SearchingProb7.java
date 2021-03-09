import java.util.Arrays;

//Maximum Subarray Sum Excluding Certain Elements
public class SearchingProb7 {
	
	public static void main(String[] arg)
	{
		int[] A = {4,1,99,7};
		int[] B = {5,6,7,1};
		int sum = 0; int res = 0;
		Arrays.sort(B);
		for(int i = 0 ; i<A.length; i++)
		{
			int l  = searchElement(0,B.length -1,B, A[i]);
			if(l == 1)
			{
				res = Math.max(res, sum);
				sum = 0;
			}
			else
			{
				sum = sum + A[i]; 
			}		
		}
		
		System.out.println(res);
	}
	
	static int searchElement(int l , int h,int[]arr, int val)
	{
		if(l > h)
			return -1;
		int mid = (l + h)/2;
		if(arr[mid] > val)
			return searchElement(l, mid-1,arr, val);
		else if(arr[mid] < val)
			return searchElement(mid+1, h,arr, val);
		else
			return 1;
	}

}
