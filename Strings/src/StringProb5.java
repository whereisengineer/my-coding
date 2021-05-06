//Removing punctuations from a given string
public class StringProb5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";
        
        // similar to Matcher.replaceAll
        String str1 = str.replaceAll("\\p{Punct}","");
          
        //System.out.println(str);
        System.out.println(str1);
        

	}

}
