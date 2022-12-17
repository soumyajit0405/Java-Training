package exceptionpkg;

import java.io.File;

public class TryCatch1 {
	int abc = 10;

	public static void main(String[] args) {
		try {
			try {
				TryCatch1 tc = null;
				System.out.print(tc.abc);
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception occurs");
			}
			try {
				int a[] = new int[5];
				a[6] = 90;
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("Array out of bound Exception occurs");
			}

			try {
				int data = 50 / 0;
			} catch (ArithmeticException e) {
				System.out.println("Arithmetic Exception occurs");
			}

			int a = Integer.parseInt("abc");

		}

		catch (Exception e) {
		
			
			System.out.println("Parent Exception occurs");
			System.out.println(e);
		}
	}
}
