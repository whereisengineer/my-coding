//Program to check if input is an integer or a string
public class StringProb6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "1992";
		int strFlag =0;
		
		for(int i = 0; i<s1.length(); i++)
		{
			if(48>s1.charAt(i) || 57<s1.charAt(i)) {
				strFlag = 1;
			}
		}
		
		if(strFlag ==1)
			System.out.println("String input");
		else
			System.out.println("Integer input");

	}

}
