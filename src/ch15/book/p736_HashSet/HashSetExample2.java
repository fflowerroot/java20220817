package ch15.book.p736_HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hong",30));
		set.add(new Member("hong",30));
		
		System.out.println("총 객체수 : "+set.size());
	}
}
