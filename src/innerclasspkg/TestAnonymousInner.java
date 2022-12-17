package innerclasspkg;

class TestAnonymousInner {
	public static void main(String args[]) {
		AnonymousOuter1 p = new AnonymousOuter1() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}
