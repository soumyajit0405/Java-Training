
public class JavaLoops {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("For loop ---> " + i);
//		}
//
//		int i = 1;
//		while (i <= 10) {
//			System.out.println("While loop ---> " + i);
//			i++;
//		}
//
//		i = 1;
//		do {
//			System.out.println("Do while loop ---> " + i);
//			i++;
//		} while (i <= 10);
//
//		for ( i = 1; i <= 10; i++) {
//			if (i == 5) {
//				System.out.println("For loop with break---> " + i);
//				break;
//			}
//		}

		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				System.out.println("For loop before continue---> " + i);
				continue;
			}
			System.out.println("For loop after continue---> " + i);
		}
	}

}
