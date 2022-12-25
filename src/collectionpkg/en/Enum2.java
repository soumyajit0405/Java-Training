package collectionpkg.en;

import java.util.*;

public class Enum2 {
	public static void main(String[] args) {
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("Week Days:" + set1);
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days:" + set2);
	}
}
