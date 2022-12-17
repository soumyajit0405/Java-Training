package MethodOverloading;

class Adder1 {
	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(Adder1.add(1, 1));
		System.out.println(Adder1.add(1.5, 1.5));
	}
}