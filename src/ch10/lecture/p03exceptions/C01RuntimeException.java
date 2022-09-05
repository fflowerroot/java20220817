package ch10.lecture.p03exceptions;

public class C01RuntimeException {
	//Runtime Exception : 실행 예외( 컴파일러가 체크하지 않는 실행 중 발생하는 예외. unchecked exception)
	public static void main(String[] args) {
		int a = Integer.parseInt("100");
		int b = Integer.parseInt("백");
		
		System.out.println("next.."); 
	}
	
}
