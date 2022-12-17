package streamspkg;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequentialInputStreamExample {
	public static void main(String args[]) throws Exception {
		FileInputStream input1 = new FileInputStream("D:\\Java Training\\testout.txt");
		FileInputStream input2 = new FileInputStream("D:\\Java Training\\testout1.txt");
		SequenceInputStream inst = new SequenceInputStream(input1, input2);
		int j;
		while ((j = inst.read()) != -1) {
			System.out.print((char) j);
		}
		inst.close();
		input1.close();
		input2.close();
	}
}
