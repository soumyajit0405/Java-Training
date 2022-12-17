package MethodOverloading;

class Adder {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println(Adder.add(1, 1));
		System.out.println(Adder.add(1, 1, 1));
	}
}