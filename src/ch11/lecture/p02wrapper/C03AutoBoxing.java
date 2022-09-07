package ch11.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		// !! 자바에서 기본타입은 객체가 아님! 메모리에 저장공간도 다름! 그러나 지금은 객체처럼 사용.
		// > 지금 객체처럼 활용하는건 자동박싱기능 때문이다.
		// 예전 버전에서는 기본타입을 참조변수에 넣으면 컴파일 오류가 났다. 지금은 자동박싱 기능때문에 오류 안남.

		int i = 1; // int는기본형(기본형은 클래스의 맴버가 이님!!... ),
			       //Integer는 int랑 매칭되는 참조형(클래스/객체)

		Integer o = Integer.valueOf(i); // 박싱
		Integer o2 = i; // 자동박싱
		int ii = o.intValue(); // 언박싱코드
		int iii = o; // 자동언박싱

		System.out.println(i + "," + o + "," + o2 + "," + ii + "," + iii);

	}
}
