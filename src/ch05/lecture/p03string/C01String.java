package ch05.lecture.p03string;

public class C01String {
	public static void main(String[] args) {
		// String은 new연산자 생략가능. 그런데 배열에서 new 생략이랑은 다름.
		String s1 = "rrr";
		String s2 = "rrr"; // new연산자 사용하지 않고 같은 문자열을 저장하면 같은주소가 저장됨

		boolean b1 = s1 == s2;
		System.out.println(b1);

		String s3 = s1 + s2;
		String s4 = s1 + s2; // String 연산을 했더니 다른 주소가 저장됨

		boolean b2 = s3 == s4;
		System.out.println(b2);

		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));

		// 참조변수의 주소를 비교하지 않고, 그 주소에 저장된 contents를 비교하고 싶으면,
		// 비교메서드 이용. String은 equals메서드 이용.
		boolean b3 = s3.equals(s4);
		System.out.println(b3);

		
//		********** 배열과 String 비교 **********
// 		같은 참조형이지만 다름
// 		String을 9번째 기본형이라고 부르는 이유다.
		
		int[] a = { 1, 2, 3 };
		a={4,5,6};

		String ss = "ss";
		ss = "ww";
	}
}
