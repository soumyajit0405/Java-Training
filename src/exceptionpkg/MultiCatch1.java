package exceptionpkg;

import java.io.IOException;

public class MultiCatch1 {
	public static void main(String[] args) {

		try {
			int a[] = new int[5];
			a[6] = 30 / 0;
		} catch (ArithmeticException  | ArrayIndexOutOfBoundsException | NullPointerException ae) {
			System.out.println("Arithmetic Exception occurs");
		} catch(Exception e) {
			System.out.println("Arithmetic Exception occurs");
		}
		System.out.println("rest of the code");
	}
}
