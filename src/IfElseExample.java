
public class IfElseExample {

	public static void main(String[] args) {
		int num = 11;
		int count = 0;
		for (int i=1;i<=num;i++) {
			if (num%i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("PRIME");
		} else {
			System.out.println("NOT PRIME");
		}

	}

}
