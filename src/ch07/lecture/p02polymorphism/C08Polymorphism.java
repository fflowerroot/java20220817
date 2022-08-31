package ch07.lecture.p02polymorphism;

public class C08Polymorphism {
	public static void main(String[] args) {
		String a = "maverick";
		System.out.println(a.length());
		
		Object b = "coyote";
//		System.out.println(b.length()); // Object타입의 참조변수로는 length()함수 사용불가
										//   왜냐하면, Object타입에는 length()함수가 없으므로.
		
		
		String c= (String)b; //다시  String 인스턴스를 String 타입의 참조변수에 저장
							 //  강제형변환
		System.out.println(c.length());
	}
}
