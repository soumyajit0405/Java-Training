package collectionpkg.al;

import java.util.*;

public class StudentArrayList {
	public static void main(String args[]) {
	
		Student s1 = new Student(101, "Sonoo", 23);
		Student s2 = new Student(102, "Ravi", 21);
		Student s3 = new Student(103, "Hanumat", 25);
	
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		for (Student a: al) {
			a.printData();
		}
	}
}
