//Missing characters to make a string Pangram.
public class StringProb3 {
	
	public static void main(String[] arg)
	{
		String s1 = "My Name is Gaurav.";
		String s2 = s1.toLowerCase();
		int[] temp = new int[26];
		
		for(int i = 0 ; i<s2.length(); i++)
		{
			if('a' <= s2.charAt(i) && 'z'>=s2.charAt(i))
			{
				temp[s2.charAt(i)-97] = 1;
			}
		}
		
		for(int i = 0 ; i< temp.length; i++)
		{
			if(temp[i] == 0)
			{
				char c =(char)('a' + i);
				System.out.print(c + " ");
			}
		}
	}

}
