package exercise_fflowerroot.js.p364_참조변수와_인스턴스의_연결_;

// field는 overriding이 안되네
// field는 method랑 다르게 참조변수에 저장된 실제 인스턴스의 것이 출력되는게 아니라
//   참조변수 타입의 인스턴스의 것이 출력됨... 근데 왜그래?
//	   그리고 static method도 참조변수 타입의 것이 출력됨...
//		참조변수에 저장된 인스턴스의 것이 출력되는건 instance method뿐이래!
//			그냥 외워야 되나;

public class BindingTest {
	public static void main(String[] args) {
		Person p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		p.m();
		p.m2(); 
		
	}

}
class Person{
	static int x = 100;
	void m() {
		System.out.println("Person m..");
	}
	static void m2() {
		System.out.println("Person m2..");
	}
}
class Child extends Person{
	int x = 200;
	void m() {
		System.out.println("Child m..");
	}
	static void m2() {
		System.out.println("Child m2..");
	}
}



