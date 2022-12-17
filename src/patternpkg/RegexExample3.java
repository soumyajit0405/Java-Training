package patternpkg;

import java.util.regex.Pattern;

class RegexExample3 {
	public static void main(String args[]) {
		System.out.println(Pattern.matches("[abc]{3}", "bbb"));// false (not a or m or n)
//		System.out.println(Pattern.matches("[abc]", "a"));// true (among a or m or n)
//		System.out.println(Pattern.matches("[abc]", "abbbcd"));// false (m and a comes more than once)
//		System.out.println(Pattern.matches("[^abc]", "v"));// false (m and a comes more than once)
//		System.out.println(Pattern.matches("[a-zA-Z]", "a"));// a through z or A through Z, inclusive (range)
//		System.out.println(Pattern.matches("[a-d[m-p]]", "n"));// a through d, or m through p: [a-dm-p] (union)
//		System.out.println(Pattern.matches("[a-z&&[def]]", "n"));//d, e, or f (intersection)
	}
}
