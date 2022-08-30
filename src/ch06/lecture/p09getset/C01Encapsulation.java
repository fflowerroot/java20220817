package ch06.lecture.p09getset;

public class C01Encapsulation {
	public static void main(String[] args) {
		MyClass1 m = new MyClass1();

//		m.age = 1;
		System.out.println(m.getAge());
		
		m.setAge(0);
		
		System.out.println(m.getAge());
		
		
	}
}
