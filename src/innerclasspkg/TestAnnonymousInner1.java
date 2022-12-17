package innerclasspkg;

class TestAnnonymousInner1 {
	public static void main(String args[]) {
		AnonymousOuter2 e = new AnonymousOuter2() {
			public void eat() {
				System.out.println("nice fruits");
			}
		};
		e.eat();
	}
}