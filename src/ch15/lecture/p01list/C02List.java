package ch15.lecture.p01list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02List {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();7
		Arrays.asList("a", "b");
		List<String> l3 = List.of("aa", "bb"); // jdk9부터 가능

		l.add("qq");
//		l2.add("qq"); // java.lang.UnsupportedOperationException
//		l3.add("qq"); // java.lang.UnsupportedOperationException

		l.set(0, "q");
		l2.set(0, "q");
//		l3.set(0, "q");  // java.lang.UnsupportedOperationException
	}
}
