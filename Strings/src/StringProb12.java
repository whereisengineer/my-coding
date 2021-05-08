//Reverse words in a given String in Java
public class StringProb12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Name is Gaurav";
		char[] ch = str.toCharArray();
		int fiIdx =0, laIdx=ch.length-1;
		
		while(fiIdx < laIdx)
		{
			char c = ch[fiIdx];
			ch[fiIdx] = ch[laIdx];
			ch[laIdx] = c;
			fiIdx++;
			laIdx--;
		}
		
		int k =0,l=0, r=0;
		while(k < ch.length)
		{
			if(ch[k] == ' ' || k == ch.length-1)
			{
				if(k==ch.length-1)
				{
					swap(ch, l,r);
					break;
				}
				swap(ch, l,--r);
				l = k+1;
				r=l;
			}
			else
			{
				++r;
			}
			++k;
			
		}
		
		for(int i = 0 ; i<ch.length; i++)
		{
			System.out.print(ch[i]+ " ");
		}
		
		

	}
	
	public static void  swap(char[] ch, int l , int r)
	{
		while(l< r)
		{
			char tmp = ch[l];
			ch[l] = ch[r];
			ch[r] = tmp;
			l++;
			--r;
		}
		
	}

}
