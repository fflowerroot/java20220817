package ch11.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		// toString 메서드는 객체의 문자열로 표현하는 기능.
		// 클래스명 @ 해시코드(16진법)
		
		Object o1 = new Object();
		Object o2 = new Object();    // o1 o2 해시코드 다르네? 아까 뭐가 같았지?
		
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		
		Object o3 = new Book(300);
		Object o4 = new Book(3300);
		
		System.out.println(o3.toString());
		System.out.println(o4.toString());
		
		Object o5 = "jj";
		Object o6= "aa";
		System.out.println(o5.toString());
		System.out.println(o6.toString());
		
	}
	
}
