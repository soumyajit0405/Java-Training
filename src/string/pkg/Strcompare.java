package string.pkg;

public class Strcompare {
	public static void main(String args[]) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = "java1";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
//		System.out.println(s1==s2);
//		System.out.println(s1==s3);
//		System.out.println(s1==s4);
		
		
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareTo(s3));
//		System.out.println(s1.compareTo(s4));
	}
}
