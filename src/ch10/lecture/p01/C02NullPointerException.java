package ch10.lecture.p01;

public class C02NullPointerException {
	public static void main(String[] args) {
		
		
		
		String s = "a";
		String ss = null;
		System.out.println(s.length());
		System.out.println(s.toString());
		
		System.out.println(ss.length()); //참조변수 값이 Null
		System.out.println(ss.toString());
		
	}
}
