package mt.t2;

public class Example4 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println("Thread Name -> " + Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String args[]) {
		Example4 t1 = new Example4();
		Example4 t2 = new Example4();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}