package exercise_fflowerroot.js;

import java.util.HashMap;
import java.util.Map;

public class p644_HashMap {
	public static void main(String[] args) {
		Map m = new HashMap();
		Object o = m.put(0, 1);
		System.out.println(o); // 왜 null ?
		
		Map<Integer,Integer> m2 = new HashMap();
		Object o2 = m2.put(0, 1);
		System.out.println(o2);
		System.out.println(m2.get(0));

	}
}
