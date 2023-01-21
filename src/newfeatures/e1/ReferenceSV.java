package newfeatures.e1;

@FunctionalInterface
interface Testable{
	void say();
}

public class ReferenceSV {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}

	public static void main(String[] args) {
		// Referring static method
		Testable testable = ReferenceSV::saySomething;
		// Calling interface method
		testable.say();
	}
}