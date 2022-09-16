package ch15.lecture.p03map;

import java.util.HashMap;
import java.util.Map;

public class C03Map {
	public static void main(String[] args) {
		// Map만들기
		//
		Map<String, String> m1 = new HashMap<String, String>();
		m1.put("s", "S");
		System.out.println(m1); // 해쉬맵에 이미 투스트링 메서드가 재정의 되어 있어서 문자열로 바로 출력 가능.

		// of메서드로 만들어진 맵은 수정 불가
		// of메서드는 버전9부터 사용 가능
		Map<String, String> m2 = Map.of("a", "A", "b", "B");// new연산자 없이 인스턴스 만든거야? >> of메서드가 인스턴스를 return함!
		System.out.println(m2);

	}
}
