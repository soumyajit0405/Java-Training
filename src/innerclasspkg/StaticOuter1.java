package innerclasspkg;

public class StaticOuter1 {
	static int data = 30;
	int data1 = 40;
	static class Inner {
		void msg() {
			System.out.println("data is " + data);
			//System.out.println("data is " + data1);
		}
	}

	public static void main(String args[]) {
		StaticOuter1.Inner obj = new StaticOuter1.Inner();
		obj.msg();
	}
}