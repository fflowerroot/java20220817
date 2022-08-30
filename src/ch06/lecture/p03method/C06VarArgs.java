package ch06.lecture.p03method;

public class C06VarArgs {
	public static void main(String[] args) {
		// 가변인자(variable argument) 	:  같은 타입 파라미터의 갯수를 모를 때 사용
		// 메소드 내에서 배열로 다룸
		// 가변인자는 마지막에 작성
		
		
		m1();
		m2();
		m2(1);
		m2(1,2);
		m2("a",1,2);
//		m3("a",1,2);
		m3("a", new int[] {1,2});
		
	}
	static void m1() {
		System.out.println("parameter가 없는 메소드");
	}
	static void m2(int...i) {
		System.out.println("parameter를 여러개 받는 메소드");
		System.out.println("length : "+i.length);
		if(i.length>0) {
			System.out.println("i[0]  :  "+i[0]);
		}
	}
	static void m2(String s, int...i) {
		System.out.println(s+i);
	}
//	static void m2(String s, int[]i) {
//		System.out.println(s+i);
//	}
	static void m3(String s, int[]i) {
		System.out.println(s+i);
	}
}
