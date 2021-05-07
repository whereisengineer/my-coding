//Quick way to check if all the characters of a string are same
public class StringProb7 {
	
	public static void main(String[] arg)
	{
		String str = "aaaaaa";
		String str2 = "Gaurav";
		
		checkChar(str);
		checkChar(str2);
	}
	
	public static void checkChar(String str)
	{
		for(int i =0 ; i<str.length()-1; i++)
		{
			if(str.charAt(i) != str.charAt(i+1))
			{
				System.out.println("Charaters not same!");
				return;
			}
		}
		
		System.out.println("Characters same");
	}

}
