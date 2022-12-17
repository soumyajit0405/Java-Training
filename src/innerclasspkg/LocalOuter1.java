package innerclasspkg;

public class LocalOuter1 {
	private int data = 30;// instance variable

	void display(int val) {
		for (int i =0;i<val;i++) {
			class Local {
				void msg() {
					System.out.println(data + val);
				}
			}
			Local l = new Local();
			l.msg();
		} 
	}

	public static void main(String args[]) {
		LocalOuter1 obj = new LocalOuter1();
		obj.display(10);
	}
}