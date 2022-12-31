package mt.t2;

public class Example1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
				//Thread.sleep(-100);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		Example1 t1 = new Example1();
		Example1 t2 = new Example1();
		t1.setName("Thread1");
		t2.setName("Thread2");
		t1.start();
		t2.start();
	}
}
