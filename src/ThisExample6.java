
public class ThisExample6 {
	ThisExample6 getA() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}

	public static void main(String args[]) {
		new ThisExample6().getA().msg();
	}
}
