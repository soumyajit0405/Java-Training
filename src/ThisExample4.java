
public class ThisExample4 {
	void m(ThisExample4 obj) {
		System.out.println("method is invoked");
		System.out.println(obj.toString());
	}

	void p() {
		m(this);
	}

	public static void main(String args[]) {
		ThisExample4 s1 = new ThisExample4();
		System.out.println(s1.toString());
		s1.p();
	}
}
