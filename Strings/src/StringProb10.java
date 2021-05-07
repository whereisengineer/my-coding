//Round the given number to nearest multiple of 10
public class StringProb10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "99", str2 ="12353", str3 = "12980" ;
		roundOff(str1.toCharArray());
		roundOff(str2.toCharArray());
		roundOff(str3.toCharArray());
	}
	
	public static void roundOff(char[] ch)
	{
		int n = ch.length; int i =ch.length -2;
		char[] newch = new char[ch.length + 1];
		if(ch[ch.length-1] == '0')
		{
			//NO CODE	
		}
		
		else if('1' <= ch[ch.length-1] && ch[ch.length-1] <= '5')
		{
			ch[ch.length-1] = '0';
		}
		else
		{
			ch[ch.length-1] = '0';
			
			while(i>=0 && ch[i] == '9')
			{
				ch[i] = '0';
				--i;
			}
			
			if(i == -1)
			{		
				newch[0] = '1';
				for(int k =0 ; k<ch.length ; k++)
				{
					newch[k+1] = ch[k];
				}
				for(int c = 0 ; c<newch.length; c++)
			    {
			    	System.out.print(newch[c]);
			    }
				return;
			}
			else
			{
				int k = ch[i] + 1;
				ch[i] = (char)k;
			}
		}
			
		
		 System.out.println();
	    for(int c = 0 ; c<ch.length; c++)
	    {
	    	System.out.print(ch[c]);
	    }
	   
	}

}
