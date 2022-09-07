package ch11.book.p461_객체_해시코드_hashCode;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		// 자바에서 맵이라는 자료구조를 구현한 클래스가 해시맵이다. (자바에서는 맵이라고 하는데
		//   다른 언어에서는 딕셔너리라는 용어를 씀. '키 : 밸류' 의 나열이다.) 
		//  	여기서 키는 1 , 홍길동은 밸류. 
		// 		 여기서는 해시코드와 이퀄즈 매서드가 모두 재정의 되어있기때문에 알맞게 찾아짐... ㅇ?
		// set? map?
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
	}
}
