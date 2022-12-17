package inf;

class A1 implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		A1 obj = new A1();
		obj.print();
		obj.show();
	}
}