//Searching in an array where adjacent differ by at most k
public class SearchingProb2 {
	public static void main(String[] arg)
	{
		int arr[] = {11, 1, 13, 26, 22, 32};
		int k = 10;
		int num = 13;
		search(arr, num, k);		
	}
	
	static void search(int[] arr, int num, int k)
	{
		int i =0;
		int n = arr.length-1;
		int rem = 0;
		while(n >0)
		{
			if(arr[i] == num)
			{
				System.out.printf("number found %d", arr[i] );
				return;
			}
			rem =  (Math.abs(arr[i] -num))/k;
			if(rem > 0)
			{
				i = i + rem;
			}
			else
			{
				i = i +1;
			}
		
			--n;
		}
		System.out.println("Not found!");
	}

}
