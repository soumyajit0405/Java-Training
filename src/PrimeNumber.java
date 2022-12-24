
public class PrimeNumber {

	public static void main(String args[]) {
		int a = 29;
		int count = 0;
		for (int i=1;i<=a;i++) {
			if (a%i == 0) {
				count++;
			}
		}
		 if (count ==2) {
			 System.out.println("Its a prime Number -> "+a);
		 } else {
			 System.out.println("Its not a prime Number");
		 }
	}
}
