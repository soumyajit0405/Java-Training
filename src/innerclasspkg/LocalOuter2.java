package innerclasspkg;

public class LocalOuter2 {
	private int data = 30;// instance variable

	void display() {
		int value = 50;
		class Local {
			void msg() {
				System.out.println(value);
				System.out.println(data);
			}
		}
		Local l = new Local();
		l.msg();
	}

	public static void main(String args[]) {
		LocalOuter2 obj = new LocalOuter2();
		obj.display();
	}
}