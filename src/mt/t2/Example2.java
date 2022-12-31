package mt.t2;

public class Example2 extends Thread {
	public void run() {
		System.out.println("running...");
	}

	public static void main(String args[]) {
		Example2 t1 = new Example2();
		t1.start();
		t1.start();
	}
}