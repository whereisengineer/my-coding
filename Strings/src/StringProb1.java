//Function to copy string .
public class StringProb1 {
	
	public static void main(String[] arr)
	{
		char s1[] = "gaurav".toCharArray();
		char s2[] = new char[s1.length];
		
		for(int i = 0; i<s1.length; i++)
		{
			s2[i] = s1[i];
		}
		
		System.out.println(String.valueOf(s2));
		
		
	}

}
