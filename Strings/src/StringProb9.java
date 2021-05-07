//Check Whether a number is Duck Number or not
public class StringProb9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "00";
		String str2 = "00123";
		String str3 = "0012303";
		
		checkDuck(str1);
		checkDuck(str2);
		checkDuck(str3);

	}
	
	public static void checkDuck(String str)
	{
		boolean duckFlag = false;
		int k = 0;
		while(k<str.length() && str.charAt(k) == '0')
		{
			++k;
		}
		for(int i = k ; i<str.length(); i++)
		{
			if(str.charAt(i) == '0') {
				duckFlag = true;
			}
		}
		
		if(duckFlag == true) {
			System.out.println("Number is Duck!");
		}
		else
			System.out.println("Not a Duck Number!");
	}

}
