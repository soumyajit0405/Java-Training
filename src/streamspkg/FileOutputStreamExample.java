package streamspkg;

import java.io.FileOutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Java Training\\testout.txt");
			 String s="Hello world";    
             byte b[]=s.getBytes();//converting string into byte array   
			//fout.write(b);
			fout.write(65);
			fout.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
