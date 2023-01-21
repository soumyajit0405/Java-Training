package mt.t3;

public class ThreadJoin1 extends Thread {
	// overriding the run method
	public void run() {
		for (int j = 0; j < 2; j++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name is: " + 
				Thread.currentThread().getName());
			}
			catch (Exception e) {
				System.out.println("The exception has been caught: " + e);
			}
			System.out.println(j);
		}
	}
}
