package innerclasspkg;

class TestNestedInterface1 implements NestedInterface1.Message {
	@Override
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String args[]) {
		NestedInterface1.Message message = new TestNestedInterface1();
		message.msg();
	}
}
