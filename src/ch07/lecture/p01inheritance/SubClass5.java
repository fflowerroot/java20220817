package ch07.lecture.p01inheritance;

public class SubClass5 extends SuperClass5 {
	
	@Override
	public void m1() {
		super.m1(); //상위클래스에 접근하기위한 'super.'
	//	this.m1();  // super를 안쓰고 this를 쓰면 무한루프..
		System.out.println("추가한 코드..");
	}
}
