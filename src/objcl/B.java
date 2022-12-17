package objcl;

public class B implements Cloneable {

	int a;
	
	B(int a) {
		this.a = a;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		B b = new B(10);
		B b1= (B)b.clone();
		System.out.println(b.a);
		System.out.println(b1.a);
		System.out.println(b.toString());
		System.out.println(b1.toString());
		
	}
}
