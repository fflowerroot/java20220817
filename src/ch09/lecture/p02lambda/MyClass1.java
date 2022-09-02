package ch09.lecture.p02lambda;

public class MyClass1 {
	public static void main(String[] args) {
		MyInterface1 o1= () -> {
			//인터페이스를 구현한 클래스생성, 추상메서드 구현(오버라이딩)의 과정을 생략.
			//  추론이 가능하니까.
		};
	}
}

interface MyInterface1{
	void m1();
}
