//Find one extra character in a string

import java.util.Arrays;

public class StringProb11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "gaurav";  // a a g u r v
		String str2 = "vargzua"; // a a c g e r v
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int flag = 0;
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i = 0 ; i<ch1.length; i++)
		{
			if(ch1[i] != ch2[i])
			{
				flag =1;
				System.out.println(ch2[i]);
				return;
			}
				
		}
		
		System.out.println(ch2[ch2.length-1]);

	}

}
