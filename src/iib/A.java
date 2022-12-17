package iib;

class A {
	A() {
		System.out.println("parent class constructor invoked");
	}
	
	{
		System.out.println("instance initializer block of parent is invoked");
	}
	
	static {
		System.out.println("static block of parent is invoked");
	}
}
