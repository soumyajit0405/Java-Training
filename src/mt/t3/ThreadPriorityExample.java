package mt.t3;

public class ThreadPriorityExample extends Thread {

 
	public void run() {
 
		System.out.println("Inside the run() method -> "+ Thread.currentThread().getName() );
	}


	public static void main(String argvs[]) {

		ThreadPriorityExample th1 = new ThreadPriorityExample();
		ThreadPriorityExample th2 = new ThreadPriorityExample();
		ThreadPriorityExample th3 = new ThreadPriorityExample();


	
		th1.setName("T1");
		th2.setName("T2");
		th3.setName("T3");
		th1.setPriority(6);
		th2.setPriority(3);
		th3.setPriority(9);


		

		Thread.currentThread().setPriority(10);

		
		th1.start();
		th2.start();
		th3.start();
	}
}