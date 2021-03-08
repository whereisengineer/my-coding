//Challenge  : Search an element in an array

import java.util.*;

public class ArraySearch {
	public static void main(String[] args) {

		int i, s = 0, input = 0;
		int arr[] = new int[100];
		for (i = 0; i < 100; i++) {
			arr[i] = s;
			s = s + 10;
		}
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		for (i = 0; i < 100; i++) {
			if (arr[i] == input) {
				System.out.println("Found " + arr[i]);
				return;
			} 
		}
		System.out.println("Not found!");
	}

}
