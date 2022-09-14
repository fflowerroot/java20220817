package ch15.lecture.p01list;

import java.util.List;

public class C03List {
	public static void main(String[] args) {
		List<String> l = List.of("a","b","c");
		for(int i = 0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		for(String item : l) {
			System.out.println(item);
		}
		
		l.forEach((e)->System.out.println(e));
		
		
	}
}
