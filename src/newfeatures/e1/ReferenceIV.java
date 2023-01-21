package newfeatures.e1;

@FunctionalInterface
interface T {
	void t();
}

public class ReferenceIV {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		ReferenceIV methodReference = new ReferenceIV(); // Creating object
		// Referring non-static method using reference
		T t1 = methodReference::saySomething;
		// Calling interface method
		t1.t();
	
	}
}