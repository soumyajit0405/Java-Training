package package2;


//import package1.A;
//import package1.*;
class B {
	public static void main(String args[]) {
		//A obj = new A();
		package1.A obj = new package1.A();
		obj.msg();
	}
}
