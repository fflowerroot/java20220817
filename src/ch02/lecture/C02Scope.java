package ch02.lecture;

public class C02Scope {
	public static void main(String[] args) {
		/* 변수는 선언된 블럭{}안에서만 사용 가능 */
		
		int a = 1;
		if(true) {
			int a = 1;  (x)
			int b = 2;
			int c = 3;
		}
		int b =2 ; 
		System.out.println(c);  (x)
	}
}
