//Find a peak element
public class SearchingProb12 {
	
	public static void main(String[] arg)
	{
		int[] arr = {101,20,15,200,23,90,91};
		int l=0,m=1,n=2;
		if(arr[l] >= arr[m])
			System.out.println("Peak Element found which is " + arr[l]);
		if(arr[arr.length-1] > arr[arr.length -2])
			System.out.println("Peak Element found which is " + arr[arr.length-1]);
		for(n =2; n<arr.length ; n++)
		{
			if(arr[m] >= arr[l] && arr[m] >= arr[n])
			{
				System.out.println("Peak Element found which is " + arr[m]);
			}
			++m; ++l;
		}
	}

}
