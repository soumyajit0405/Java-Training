package collectionpkg.set;

import java.util.*;

public class HashSetExample3 {
	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		
		HashSet<String> set = new HashSet(list);
		
		set.add("Gaurav");
		
		for (String s:set) {
			System.out.println(s);
		}
	}
}
