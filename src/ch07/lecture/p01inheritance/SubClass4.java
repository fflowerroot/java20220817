package ch07.lecture.p01inheritance;

public class SubClass4 extends SuperClass4{
	
	@Override		// override한 메서드인지 컴파일러가 점검하게하는 어노테이션.
	public void method1() { // 이클립스가 오버라이드한 메서드를 표시해준다. 번호 옆에..
		System.out.println("SubClass4 method..");
	}
	@Override
	public void method3() {
		// 빈 곳에 커서 두고 ctrl + space 하면 힌트얻기 가능. 자동 override메서드 생성 가능.
		super.method3();
	}
}
