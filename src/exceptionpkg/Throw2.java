package exceptionpkg;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Throw2 {
	public static void validate(int age) throws FileNotFoundException{
		if (age < 18) {
			throw new FileNotFoundException("File Not Found");
		} else {
			System.out.println("Person is eligible to vote!!");
		}
	}

	// main method
	public static void main(String args[]) throws FileNotFoundException{
		validate(13);
		System.out.println("rest of the code...");
	}
}
