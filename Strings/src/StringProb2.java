//Pangram Checking 
//Given a string check if it is Pangram or not. A pangram is a sentence containing every letter in the English Alphabet.
public class StringProb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = "The quick brown fox jumps over the lazy dog";
		String s2 = s1.toLowerCase();
		char c1[] = s2.toCharArray();
		
		int flag[] = new int[1000];
		
		if(c1.length <  26)
		{
			System.out.println("Not Panagram!");
		}
		int k =0;
		for(int i = 0 ; i<c1.length; i++)
		{
			flag[c1[i]] = 1;
		}
		
		
		for(int i =97 ; i<123; i++)
		{
			System.out.println(flag[i]);
			if(flag[i] == 0)
			{
				System.out.println("Not Panagram!");
				return;
			}
		}
		
		System.out.println("Panagram!");
		
		

	}

}
