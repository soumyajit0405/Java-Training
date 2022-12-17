
public class UnaryOperator {

	public static void main(String[] args) {

		int x=10;  
		System.out.println(x++);  
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
		
		int a = 50;
		int b= 40;
		System.out.println(a+(++b-(--b)));
		
	}

}
