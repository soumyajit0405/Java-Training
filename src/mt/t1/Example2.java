package mt.t1;

public class Example2 implements Runnable {
	public void run() {
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {
		Example2 m1 = new Example2();
		Thread t1 = new Thread(m1); // Using the constructor Thread(Runnable r)
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
	}
}