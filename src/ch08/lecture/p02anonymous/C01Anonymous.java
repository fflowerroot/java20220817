package ch08.lecture.p02anonymous;

public class C01Anonymous {
	public static void main(String[] args) {
		MyInterface1 o1 = new MyInterface1() { 
			// 인터페이스 구현과 클래스의 객체생성을 한번에 함
			// 		> 인터페이스이름으로 객체를 생성. 클래스의 이름은 없음(익명클래스) 
			//		    인터페이스이름으로 객체 사용.
			// 근데 그럴거면 인터페이스를 왜 씀?
			
			@Override
			public void m() {
				System.out.println("overriding ..");	
			}
		};
			o1.m();	
	}
}
//class MyClass1 implements MyInterface1{}
 interface MyInterface1{
	 public void m();
 }
