package ch04.lecture.p02method;

public class C07Return {
	public static void main(String[] args) {
		m1();
		System.out.println("....");
	}
	
	static void m1(){
		System.out.println("..");
		if(true) {
			return ;
		}
	} // 이런 메서드가 가능하네? >> 단 return 값을 적을 수는 없어. 
	// void 메서드에서는 return을 쓸 수는 있지만 종료의 기능으로만 가능.

	static void m2(){
		return;
	}
	static void m3() {
		if(false) {
			return;
		}
	}
}
