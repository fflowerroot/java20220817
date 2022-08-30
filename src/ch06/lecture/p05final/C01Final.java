package ch06.lecture.p05final;

public class C01Final {
	public static void main(String[] args) {
		// final : 변수에 값을 한 번만 할당할 수 있다
		int a = 3;
		a = 4;
		
		final int b;
		b = 9;
		b = 1;
		
		

	}
	static void m1(int i) {
		i = 1;
	}
	static void m2(final int i) {
		i = 1;			// method호출시 파라미터에 값이 한 번 할당되므로 재선언 불가
	}
	
}
