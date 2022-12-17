package patternpkg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 {
	public static void main(String args[]) {
//1st way  
//		Pattern p = Pattern.compile(".s");// . represents second character
//		Matcher m = p.matcher("as");
//		boolean b = m.matches();

//2nd way  
		//boolean b2 = Pattern.compile(".s").matcher("as").matches();

//3rd way  
		boolean b3 = Pattern.matches(".st.", "psty");

		System.out.println( b3);
		
		
		
//		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
//		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
//		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
//		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
//		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)  
	}
}
