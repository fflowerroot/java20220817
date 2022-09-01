package ch07.lecture.p03abstract;

public class Sub2 extends Super2 { 
	// The type Sub2 must implement the inherited abstract method Super2.cry()
	// 추상메서드 : body(구현부)가 없는 메서드
	// 상속받는 클래스는 상속받은 모든 추상메서드를 구현해야한다.
	// 추상메서드가 있는 클래스는 꼭 추상클래스여야한다.
	// 추상클래스의 상위추상클래스를 만들 수 있다.
	// 추상클래스 : 인스턴스를 만들 수 없는 클래스!
	@Override
		public void cry() {
			System.out.println("왈왈..");	
		}	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
}
