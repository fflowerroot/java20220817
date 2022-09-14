package ch15.book.p725_Array_List;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayAsListExample {
	public static void main(String[] args) {
		//for
		List<String> l = Arrays.asList("a","b","c");
		for(String s : l) {
			System.out.println(s);
		}
		//forEach
		l.forEach((e) -> System.out.println(e));

		//Iterator
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		List<Integer> ll= Arrays.asList(1,2,3);
		for(int i :ll) {
			System.out.println(i);
		}
	}
}
