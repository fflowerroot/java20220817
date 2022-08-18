package ch02.lecture;

public class C11String {

	public static void main(String[] args) {
		/* String은 문자(char)의 나열 
		   String은 참조타입. 객체임. 
		   연결연산(+) 가능. 연결연산 결과는 String 
		   */
		/* java api는 이미 만들어진 라이브러리의 인터페이스..
		   >> 사전처럼 계속 사용할 것임*/
		
		/* 만들지 않은 함수 (api에 등록된..)
		   1. 변수.소문자함수
		   2. 소문자함수?
		   3. 대문자함수
		   
		   원래 함수사용은..
		   1.참조변수.함수이름()
		   2.클래스이름.함수이름()
		   3. 같은 클래스의 cm은 >> 함수이름()	
		   
		   원래 멤버변수사용은..
		   1. 참조변수.iv
		   ..
		 */

		String s = "bts's rm";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
	//	System.out.println(s.charAt(4));
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(2,4));
		
	}

}
