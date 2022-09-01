package ch08.lecture.p01interface;

public class C04Casting {
	public static void main(String[] args) {
		CharSequence o1 = "topgun";
		int len = o1.length();
//		boolean b = o1.isEmpty();
		char c = o1.charAt(len);

		
		
//		byte[] bytes = o1.getBytes(); 
		//The method getBytes() is undefined for the type CharSequence
		// CharSequence 타입에 정의된 메서드만 쓸 수 있음
		
		
		byte[] bytes = ((String) o1).getBytes(); // String 인스턴스였기 때문에  String으로 강제형변환
	
	}
}
