package newfeatures.e2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);
	}

}
