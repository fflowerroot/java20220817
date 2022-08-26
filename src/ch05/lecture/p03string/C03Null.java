package ch05.lecture.p03string;

public class C03Null {
	public static void main(String[] args) {
		int[]a;
		String b;
		String c="";
		
		a=null; 	//null값 저장 가능.
		b=null;
		
//		지정된 객체가 없는데 객체의 속성을 사용하려고해서 에러가 남.		
		System.out.println(c.length());
//		System.out.println(a.length);
//		System.out.println(b.length());
		
		
		
	}
}
