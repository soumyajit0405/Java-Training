package string.pkg;

public class StrBuffer {
	public static void main(String args[]) {
		StringBuffer sb = new StringBuffer("");
		System.out.println(System.currentTimeMillis());
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java
		System.out.println(System.currentTimeMillis());
		//sb.append(" Java");
		//System.out.println(sb);
		
//		sb.insert(1,"Java");  
//		System.out.println(sb);
		
//		sb.replace(1,3," Java ");  
//		System.out.println(sb);
		
		//System.out.println(sb.reverse());
		
//		System.out.println(sb.capacity());//default 16  
//		sb.append("Hello");  
//		System.out.println(sb.capacity());//now 16  
//		sb.append("java is my f");  
//		System.out.println(sb.capacity());
		//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
	}
}
