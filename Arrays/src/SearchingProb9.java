//Leaders in an array
// An element is leader if it is greater than all the elements to its right side. And the rightmost element is always a leader.
public class SearchingProb9 {
	
	public static void main(String[] arg)
	{
		int[] arr = {2,5,2,0,3,6,1,0};
		int curr_leader = arr[arr.length -1];
		System.out.println(curr_leader);
		for(int i=arr.length-2; i>=0; i--)
		{
			if(arr[i] > curr_leader)
			{
				curr_leader = arr[i];
				System.out.println(curr_leader);
			}
		}
	}

}
