//challenge : Rotate an array by number d.
import java.util.*;
public class ArrayRotation {
	public static void main(String[] args) {
		System.out.println("Enter number of elements in array");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter an array");
		for(int i =0; i<n ; i++) {
			arr[i] = scan.nextInt();
			}
		System.out.println("Enter the value to rotate");
		int d = scan.nextInt();
		//Rotate by one algorithm
		while(d>0) {
			int p = arr[0];
			for(int i =0; i<n-1; i++) {
				arr[i] = arr[i+1];
			}
			arr[n-1] = p;
			--d;
		}
		for(int i =0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
