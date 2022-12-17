package iib;

class B extends A {
	B() {
		super();
		System.out.println("child class constructor invoked");
	}

	{
		System.out.println("instance initializer block is invoked");
	}
	
	static {
		System.out.println("static block of child is invoked");
	}

	public static void main(String args[]) {
		B b = new B();
	}
}