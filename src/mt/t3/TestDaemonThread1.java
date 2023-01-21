package mt.t3;

public class TestDaemonThread1 extends Thread {
	public void run() {
		if (Thread.currentThread().isDaemon()) {// checking for daemon thread
			System.out.println("daemon thread work -> "+Thread.currentThread().getName() +" -> "+Thread.currentThread().getPriority());
		} else {
			System.out.println("user thread work -> "+Thread.currentThread().getName() +" -> "+Thread.currentThread().getPriority());
		}
	}

	public static void main(String[] args) {
		TestDaemonThread1 t1 = new TestDaemonThread1();// creating thread
		TestDaemonThread1 t2 = new TestDaemonThread1();
		TestDaemonThread1 t3 = new TestDaemonThread1();
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		t1.setDaemon(true);// now t1 is daemon thread

		t1.start();// starting threads
		t2.start();
		// t2.setDaemon(true);//will throw exception here  
		t3.start();
	}
}
