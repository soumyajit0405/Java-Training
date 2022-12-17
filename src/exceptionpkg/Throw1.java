package exceptionpkg;

public class Throw1 {
	public static void validate(int age) {
		if (age < 18) {
			throw new Error();
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	
	public static void main(String args[]) {
		validate(12);
		System.out.println("rest of the code...");
	}
}
