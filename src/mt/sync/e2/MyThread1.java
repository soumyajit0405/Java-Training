package mt.sync.e2;

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

public void run(){  
t.printTable(5);  
}
}