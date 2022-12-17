package MethodOverloading;

class MainMethodOverload {
	public static void main(String[] args) {
		System.out.println("main with String[]");
	}

	public static void main(String args) {
		System.out.println("main with String");
	}

	public static void main() {
		System.out.println("main without args");
	}
	
	public static void main(int[] args) {
		System.out.println("main with int[]");
	}
}