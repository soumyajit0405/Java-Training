package objcl;

public class WrapperExample {
	public static void main(String args[]) {
//Converting int into Integer  
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a + " " + i + " " + j);
		
		Integer a1=new Integer(3);    
		int i1=a1.intValue();//converting Integer to int explicitly  
		
	}
}
