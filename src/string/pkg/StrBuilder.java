package string.pkg;

public class StrBuilder {
	public static void main(String args[]) {
		StringBuilder sb = new StringBuilder("Hello ");
		System.out.println(System.currentTimeMillis());
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		System.out.println(System.currentTimeMillis());
	}
}
