package newfeatures.e1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TrywithResourceExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fileStream = new FileOutputStream("D:\\Java Training\\testout.txt");
		try (fileStream) {
			String greeting = "Hello world.";
			byte b[] = greeting.getBytes();
			fileStream.write(b);
			System.out.println("File written");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
