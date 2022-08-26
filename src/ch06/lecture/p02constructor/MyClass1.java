package ch06.lecture.p02constructor;

public class MyClass1 {
	String name;   //field
	
	
	
	// 생성자(constructor)
	// 생성자명 = 클래스명
	// () :파라미터목록
	// {} : 실행코드
	// 생성자 overloading 가능 (메서드와 동일)
	// method overloading : 파라미터의 타입, 갯수, 순서를 구분해서 여러 메서드를 만들 수 있다
	
	// 생성자가 하는일 : 필드 초기화, 메서드 호출해서 객체 사용할 준비. 
	
	// 생성자를 작성하지 않으면 컴파일러가 기본생성자 삽입하지 않음.
	
	// 생성자 단축키 	:	생성자이름 클릭하고 f3 => 생성자가 만들어진 클래스로 이동함
	//						돌아가는 단축키	:	Alt + <(방향키)
	public MyClass1(){
		System.out.println("parameter 없는 생성자 실행됨");
		
	}
	public MyClass1(String name) {
		
		System.out.println("parameter 있는 생성자 실행됨");
	}
	
}
