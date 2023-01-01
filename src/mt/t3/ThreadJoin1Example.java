package mt.t3;

public class ThreadJoin1Example {
	// main method
	public static void main(String argvs[]) {

		// creating 3 threads
		ThreadJoin1 th1 = new ThreadJoin1();
		ThreadJoin1 th2 = new ThreadJoin1();
		ThreadJoin1 th3 = new ThreadJoin1();

		// thread th1 starts
		th1.start();

		// starting the second thread after when
		// the first thread th1 has ended or died.
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());

			// invoking the join() method
			th1.join();
		}

		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		// thread th2 starts
		th2.start();

		// starting the th3 thread after when the thread th2 has ended or died.
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName());
			th2.join();
		}

		// catch block for catching the raised exception
		catch (Exception e) {
			System.out.println("The exception has been caught " + e);
		}

		// thread th3 starts
		th3.start();
	}
}
