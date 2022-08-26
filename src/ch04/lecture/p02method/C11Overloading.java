package ch04.lecture.p02method;

public class C11Overloading {
	public static void main(String[] args) {
		//-------method overloading----------
		// 메서드명이 같아도 parameter의 '타입', '개수', '순서!'가 다르다면 같은이름으로 여러개의 메서드를 선언할 수 있다.
		// JVM이 parameter를 보고 어떤 메서드를 호출해야하는지 결정해준다.
		// 그리고, 작은타입 인수가 큰 타입 파라미터로 들어갈 수 있지만, 
		//		작은타입 파라미터(일치하는 파라미터)가 있다면 그 메서드부터 호출된다. 
		// 대표적인 overloading된 메서드는 print메서드이다.
		// overloading은 parameter와 관련된 것이지, return type과는 아무런 관련이 없다!
		
		// 메서드 overriding이랑은 다른개념임
		// 메서드 overriding은 과적하는 것이 아니라, 수정하는 것이다. 
		
		
		method1(3,5);
	}

	private static void method1(int i, int j) {
		
		
	}
}
