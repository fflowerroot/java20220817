package ch11.lecture.p02wrapper;

public class C01Wrapper {
	public static void main(String[] args) {
		// 기본타입을 참조타입으로 쓰고 싶을 때!
		// 기본타입 8개에 매칭이 되는 참조타입 8개가 있다.
		
		// String과 int를 배열에 섞어서 넣고 싶을 때
		// -> 기본타입을 참조타입으로 감싸는 객체를 만들어서 해결
		
		int i = 1;
		Integer o1 = Integer.valueOf(i);
		Integer o2 = i;
		
	}
}	
