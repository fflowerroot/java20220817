package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class C01Set {
	public static void main(String[] args) {
		Set<String>	set = new HashSet<>();
		
		set.add("ironman");
		set.add("captain");
		set.add("black");
		set.add("hulk");
		
		int size = set.size();
		
		boolean b1 = set.add("hu");
		
		System.out.println(size);
		System.out.println(b1);
		System.out.println(set);
		System.out.println(set.contains(set));//false
		System.out.println(set.contains("ironman"));
		System.out.println(set.remove("ironman"));
		System.out.println(set);
		
	}
}
