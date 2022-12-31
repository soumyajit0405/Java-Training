package mt.t1;

public class Example1 extends Thread {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Example1 t1 = new Example1();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	}
}