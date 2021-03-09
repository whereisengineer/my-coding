//Find the element that appears once in an array where every other element appears twice
public class SearchingProb6 {
	
	public static void main(String[] arg)
	{
		int[] arr = {1,2,5,1,6,6,3,3,5};
		int res = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			res = res ^ arr[i];
		}
		System.out.printf("element is %d ", res);
	}

}
