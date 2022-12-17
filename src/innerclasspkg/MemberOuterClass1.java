package innerclasspkg;

public class MemberOuterClass1 {
	private int data = 30;

	class Inner {
		void msg() {
			System.out.println("data is " + data);
		}
	}

	public static void main(String args[]) {
//		MemberOuterClass1 obj = new MemberOuterClass1();
//		MemberOuterClass1.Inner in = obj.new Inner();
		MemberOuterClass1.Inner in = new MemberOuterClass1().new Inner();
		in.msg();
	}
}
