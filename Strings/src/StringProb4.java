/**
 * 
 */

/**
 * Check if a string is Pangrammatic Lipogram.
 * 
 * Lipogram: A lipogram is a kind of constrained writing or word game consisting of writing paragraphs or longer works in 
 * which a particular letter or group of letters is avoided
 * 
 * A pangrammatic lipogram is a text that uses every letter of the alphabet except one. 
 *
 */
public class StringProb4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "The quick brown fox jum over the lazy dog";
		String s2 = s1.toLowerCase();
		boolean[] flagChar = new boolean[26];
		int counter = 0;
		
		for(int i =0; i<s2.length(); i++)
		{
			if('a' <= s2.charAt(i) && 'z'>= s2.charAt(i))
			{
				flagChar[s2.charAt(i) - 97] = true;
			}
		}
		
		for(int i = 0; i<flagChar.length; i++)
		{
			if(flagChar[i] == false)
			{
				counter++;
			}
		}
		
		if(counter == 0) {
			System.out.println("Panagram but not Panagrammatic lipogram");
		}
		else if(counter == 1) {
			System.out.println("Panagrammatic lipogram");
		}
		else {
			System.out.println("Not Panagram but might be lipogram");
		}

	}

}
