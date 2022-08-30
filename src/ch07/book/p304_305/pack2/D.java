package ch07.book.p304_305.pack2;

import ch07.book.p304_305.A;

// 같은 패키지 내에서는 부모의생성자도 자유롭게 호출가능. 
//   다른패키지에서는 생성자는 자식생성자에서 super를 이용해서만 호출가능.
// 	    나머지 멤버들은 자신의 멤버처럼 사용가능



public class D extends A {
	public void m() {
		A a = new A();
		
		field ="d";
		m();
		field2 = "d";		// 다른 패키지에 있을 경우, 
							//    protected보다 좁은 법위의 접근제어자를 사용한 멤버에는, 
							//      자식클래스라도 접근불가
	}
	public D() {
		super();
		this.field="ss";
		this.m();
	}
	
	public void m2() {
//		A a = new A();
		field ="d";
		m();
				
	}
}
