package exceptionpkg;

import java.io.FileNotFoundException;

public class ExceptionPropogation {
	void m() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	void n() throws FileNotFoundException {
		m();
	}

	void p() throws FileNotFoundException {
		n();
	}

	public static void main(String args[]) throws FileNotFoundException {
		ExceptionPropogation obj = new ExceptionPropogation();
		try {
			obj.p();
		} catch (Exception e) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow...");
	}
}
