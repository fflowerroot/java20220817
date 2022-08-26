package ch06.lecture.p02constructor;

public class MyClass4 {
	String name;
	int age;

//	public MyClass4(String s, int i) {
//		name = s;
//		age = i;
//	}

	public MyClass4(String name, int age) { 
		name = name; 		// name이 모두 가장 가까운 위치의, 파라미터의 name을 가리킴.
		age = age;			//   The assignment to variable name has no effect
	}
	
//	public MyClass4(String name, int age) {
//	this.name = name;			// 아직 객체생성전인 설계단계이므로 참조변수가 없어서 this를 써줬음.
//	this.age = age;				//	같은 이름의 파라미터와 구별하기 위한 것이다.
//}								//    원래는, '같은 클래스 내의 인스턴스 메서드에서' 필드를 쓰는 것이기 때문에 
								//		참조변수생략가능하다. 오로지 구별을 위해서.

}
