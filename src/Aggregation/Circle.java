package Aggregation;

class Circle {
	Operation op;// aggregation

	void print() {
		System.out.println("Hello in class Circle ");
		op = new Operation();
		op.print();
	}

	public static void main(String args[]) {
		Circle c = new Circle();
		c.print();
	}
}
