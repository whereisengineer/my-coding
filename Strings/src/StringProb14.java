//Count Uppercase, Lowercase, special character and numeric values
public class StringProb14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "#GeeKs01fOr@gEEks07";
		char[] ch = str.toCharArray();
		int l = 0, u=0,n=0, s=0;
		for(int i = 0 ; i< ch.length; i++)
		{
			if(65 <= ch[i] && 90 >= ch[i])
			{
				u++;
			}
			else if(97 <=ch[i] && 122 >= ch[i])
			{
				l++;
			}
			else if(48 <= ch[i] && 57 >= ch[i])
			{
				n++;
			}
			else
			{
				s++;
			}
		}
		
		System.out.println("Lower case letter: "+ l);
		System.out.println("Upper case letter: "+ u);
		System.out.println("Number are: "+ n);
		System.out.println("Special letter: "+ s);
	}

}
