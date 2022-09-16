package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C01Map {
	public static void main(String[] args) {
		// Map
		// '(key, value)' 쌍(entry)으로 저장됨
		// key는 하나의 value와 mapping됨
		// Map 인터페이스를 구현한 클래스들이 많은데 별 일 없으면 HashMap을 씀
		
		Map<String, String > map = new HashMap<String, String>();
		
		//entry추가--
		map.put("jimin", "h.o.t.");
		map.put("hangman", "topgun");
		map.put("jimin", "bts");
		
		int size=map.size();
		System.out.println(size);
		System.out.println(map);
		
		//
		String s1 = map.remove("jimin");
		System.out.println(size); // ?? 왜 size가 그대로지? >;; size변수로 받은걸 출력하고 있었음..;
		System.out.println(map.size()); 
		System.out.println(s1);
		System.out.println(map);
		String s2 = map.remove("jimin");
		System.out.println(map.size()); 
		System.out.println(s2);
		System.out.println(map);
		String s3 = map.remove("hangman");
		System.out.println(size); 
		System.out.println(s3);
		System.out.println(map);
		
		//
		boolean b1 = map.containsKey("jimin");
		System.out.println(b1);
		//
		String val1= map.get(s1);
		System.out.println(size);
		 
	}
}
