
public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 125;
		int num1 = num;
		int reminder = 0;
		int sum = 0;
		while (num > 0) {
			reminder = num % 10;
			num = num / 10;
			sum = sum + (reminder * reminder * reminder);
		}
		if (sum == num1) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not An Armstrong Number");
		}
	}
}
