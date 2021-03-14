//Maximum equlibrium sum in an array
public class SearchingProb8 {
	
	public static void main(String[] arg)
	{
		int[] arr = {-1,0,3,1,3,4,-1};
		int pref = 0, sum =0, res =0;
		
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		
		for(int i=0; i<arr.length; i++)
		{
			pref = pref + arr[i];
			if(sum == pref)
			{
				res = Math.max(res, pref);
			}
			sum = sum - arr[i];		
		}
		
		System.out.println("max equilibrium sum is "+ res);
	}

}
