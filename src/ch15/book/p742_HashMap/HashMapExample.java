package ch15.book.p742_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("sin", 1);
		map.put("hong", 2);
		map.put("dong", 3);
		map.put("hong", 4);
		System.out.println("총 Entry 수 : " + map.size());

		// 객체 찾기
		System.out.println("\thong : " + map.get("hong"));
		System.out.println();
		// 객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();

		// 객체삭제
		map.remove("hong");
		System.out.println("총 Entry 수 : " + map.size());

		// 객체를 하나씩처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + "  :" + value);
		}
		System.out.println();

		// 객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}
}
