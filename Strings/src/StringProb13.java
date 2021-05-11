//Compare two strings lexicographically in Java
public class StringProb13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "gaurav";
		String str2 = "gaurav";
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int s1=0, s2= 0;
		
		while(s1 < ch1.length && s2< ch2.length)
		{
			if(ch1[s1] < ch2[s2])
			{
				System.out.println("str2 is greater");
				return;
			}
			else if(ch1[s1] > ch2[s2])
			{
				System.out.println("str1 is greater");
				return;
			}
			else
			{
				s1++;
				s2++;
			}
		}
		
		if(s1 < ch1.length)
		{
			System.out.println("str1 is greater");
		}
		else if(s2 < ch2.length)
		{
			System.out.println("str2 is greater");
		}
		else
		{
			System.out.println("Both are equal!");
		}

	}

}
