package inf;

class A implements Printable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		A obj = new A();
		obj.print();
		System.out.println(obj.toString());
	}
}