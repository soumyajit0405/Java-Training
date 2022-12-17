package socketprogrammingpkg;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("58.105.113.115", 6666);
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello Server");
			dout.flush();
			dout.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}