package ch08.lecture.p01interface;

public class MyClass3 implements MyInterface3{
	// 추상메서드를 재정의하지 않으려면  abstract class여야 함

	@Override
	public void m1() {
		System.out.println("myclass3 m1");
		
	}

	@Override
	public void m2() {
		System.out.println("myclass3 m2");
		
	}

	@Override
	public void m3() {
		System.out.println("myclass3 m3");
		
	}

	@Override
	public void m4() {
		System.out.println("myclass3 m4");
		
	} //The type MyClass3 must implement the inherited abstract method MyInterface3.m1()
	
	

}
