//Program to find the initials of a name.
public class StringProb8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gaurav kumar Kalra arora";
		System.out.print(str.charAt(0) + " ");
		for(int i =0 ; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ')
			{
				System.out.print(Character.toUpperCase(str.charAt(i+1)) + " ");
			}
		}

	}

}
