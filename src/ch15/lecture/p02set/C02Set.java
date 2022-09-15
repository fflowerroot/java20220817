package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("1");
		set.add("2");
		set.add("3");
		System.out.println(set);
		// 순서대로 저장  x ?
		
		System.out.println("for문 사용");
		for(String element : set) {
			System.out.println(element);  
		}

		
		// iterator는 while문과 궁합이 맞음
		System.out.println("Iterator 사용");
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("forEach 메소드 사용");
		set.forEach((e) -> System.out.println(e));
	}
}
