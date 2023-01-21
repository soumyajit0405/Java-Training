package reflection.e1;
class Simple{}    

public class ForNameExample {
	public static void main(String args[]) throws Exception {
		
		Simple obj = new Simple();
		  Class c=obj.getClass();    
		
		System.out.println(c.getName());
		
		
			Class c1 = Integer.class;   
		   System.out.println(c1.getName());  
		  
		   Class c2 = ForNameExample.class;   
		   System.out.println(c2.getName());  
		   
		   
	}
}
