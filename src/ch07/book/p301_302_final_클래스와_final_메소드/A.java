package ch07.book.p301_302_final_클래스와_final_메소드;

// final과 static final의 차이
// final 필드(멤버변수)는 '인스턴스변수(iv)'로서 '생성자(생성자는 인스턴스를 생성하는 역할을 한다)'를 통해서 초기화하면 객체마다 다른값 저장 가능.
// static final 필드는 '클래스변수(cv)'로서  'static초기화블럭'을 통해서 초기화가능. 상수로서 어디서든 값이 동일.
// cf ) 멤버: 멤버변수(필드) + 멤버메서드(메서드) ? 

public class A {
	public static void main(String[] args) {
		B b = new B(3);
		
		
	}
}
class B{
	
	final int i = 1;
	final int ii;
	
	public B(int ii) { this.ii = ii; }

	public int m(int i) {
		return 4;
	}
	int m(int i) {
		return 5;
	}
	int m(int )
}











