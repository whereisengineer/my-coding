//Find position of an element in a sorted array of infinite numbers
public class SearchingProb5 {
	public static void main(String[] arg)
	{
		int[] arr = {1, 20, 200, 250, 300, 345, 500, 1000};
		int num = 1001;
		int l = 0;
		int h = 1;
		int n = arr.length;
		while(n > 0)
		{
			if(h == arr.length-1 && arr[h] < num)
			{
				System.out.println("Element not found!");
				return;
			}
			if(arr[h] == num)
			{
				System.out.printf("element found at the position %d", h);
				return;
			}			
			else if(arr[h] > num)
			{
				//binary search from l to h
				binarySearch(arr, l, h, num);
				return;
			}			
			else
			{
				l= h;
				h = h *2;
				if(h>arr.length-1)
				{
					h =arr.length-1;
				}
			}	
			--n;
		}	
	}
	
	static void binarySearch(int[] arr, int l , int h, int num)
	{
		if(l>=h)
		{
			System.out.println("element not found!");
			return;
		}
			
		int mid = (l + h)/2;
		if(arr[mid] == num)
		{
			System.out.printf("element found at the position %d", mid);
			return;
		}
		else if(arr[mid] > num)
			binarySearch(arr, l, mid-1, num);
		else
			binarySearch(arr, mid+1, h, num);
	}

}
