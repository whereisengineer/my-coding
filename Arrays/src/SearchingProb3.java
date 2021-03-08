//Find common elements in three sorted arrays
public class SearchingProb3 {
	public static void main(String[] arg)
	{
		int[] arr1 = {1, 3, 6,8, 9, 12};
		int[] arr2 = {2,4,6,8,10};
		int[] arr3 = {61,81};
		findCommon(arr1, arr2, arr3);
	}
	
	static void findCommon(int[] arr1, int[] arr2, int[] arr3)
	{
		int i=0, j=0, k=0;
		int n1 = arr1.length;
		int n2 = arr2.length;
		int n3 = arr3.length;
		int flag =0;
		while(i< n1 && j <n2 && k<n3)
		{
			if((arr1[i] == arr2[j]) && (arr2[j] == arr3[k]))
			{
				System.out.printf("common element is %d\n", arr1[i]);
				++i;++j;++k;
				flag =1;
			}
			else if(arr1[i] < arr2[j])
			{
				++i;
			}
			else if(arr2[j] < arr3[k])
			{
				++j;
			}
			else
			{
				++k;
			}
		}
		
		if(flag == 0)
		{
			System.out.println("No Common Element Found!");
		}
		
	}

}
