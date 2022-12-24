package collectionpkg.set;

import java.util.*;

public class HashSetExample1 {
	public static void main(String args[]) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("Five");
		
		for(String s:set) {
			System.out.println(s);
		}
	}
}
