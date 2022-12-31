package mt.t2;

public class Example3 extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		Example3 t1 = new Example3();
		t1.run();// fine, but does not start a separate call stack
	}
}