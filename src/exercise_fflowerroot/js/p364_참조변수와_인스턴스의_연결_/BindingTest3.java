package exercise_fflowerroot.js.p364_참조변수와_인스턴스의_연결_;

public class BindingTest3 {
	public static void main(String[] args) {
		Person2 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println(p.x);
		p.m();
	}
}	
class Person2{
		int x =100;
		
		void m() {
			System.out.println("Person m..");
		}
	}
class Child2 extends Person2{
	int x = 200;
	
	void m() {
		System.out.println(x); //this.x와 같다
		System.out.println(super.x);
		System.out.println(this.x);
	}
}
