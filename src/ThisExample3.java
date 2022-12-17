
public class ThisExample3 {
	ThisExample3() {
		this(100);
		System.out.println("hello a");
	}

	ThisExample3(int x) {
		System.out.println(x);
	}

	public static void main(String args[]) {
		ThisExample3 a = new ThisExample3();
	}
}
