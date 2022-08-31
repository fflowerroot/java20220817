package exercise_fflowerroot.js.ch07._5_4참조변수와_인스턴스의_연결;

public class BindingTest {
	public static void main(String[] args) {
		Person p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		p.m();
		
	}

}
class Person{
	static int x=100;
	void m() {
		System.out.println("Person m..");
	}
}
class Child extends Person{
	int x=200;
	void m() {
		System.out.println("Child m..");
	}
}
