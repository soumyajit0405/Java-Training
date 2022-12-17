package finalkeyword;

class A {
	//final int speedlimit = 90;// final variable
	final int speedlimit; // Blank variable
	/*
	 * void run() { speedlimit = 400; }
	 */
	
	A() {
		speedlimit = 400;
	}

	public static void main(String args[]) {
		A obj = new A();
		//obj.run();
	}
}
