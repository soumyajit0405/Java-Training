
public class ThisExample2 {
	void m() {
		System.out.println("hello m");
	}

	void n() {
		System.out.println("hello n");
		// m();//same as this.m()
		this.m();
	}

	public static void main(String args[]) {
		ThisExample2 a = new ThisExample2();
		a.n();
	}

}
