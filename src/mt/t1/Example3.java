package mt.t1;

public class Example3 {
	public static void main(String argvs[]) {

		Thread t = new Thread("My first thread");

		t.start();

		String str = t.getName();
		System.out.println(str);
	}
}