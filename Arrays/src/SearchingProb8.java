//Maximum equlibrium sum in an array and 
// Equilibrium index of an array
public class SearchingProb8 {
	
	public static void main(String[] arg)
	{
		int[] arr = {-1,2,3,1,3,2,-1};
		int pref = 0, sum =0, res =0, index =0;
		
		for(int i=0; i<arr.length; i++)
			sum = sum + arr[i];
		
		for(int i=0; i<arr.length; i++)
		{
			pref = pref + arr[i];
			if(sum == pref)
			{
				if(res < pref)
				{
					res = pref;
					index = i;
				}
			}
			sum = sum - arr[i];		
		}
		
		System.out.println("max equilibrium sum is "+ res);
		System.out.println("Equilibrium index is "+ index);
	}

}
