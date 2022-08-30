package ch06.lecture.p05final;

public class MyClass1 {
	// static final	: 상수
	// 상수명(static final) 작성 관습  >>  UPPER_SNAKE_CASE
	// 초기화되지 않은 final 필드는 생성자에서 반드시 초기화되어야한다
	//  초기화되지 않은 static final 필드(상수)는 static블럭에서 반드시 초기화되어야한다
	//		> 생성자는 객체를 생성할 때 쓰이는 것이므로. static은 static블럭에서 초기화.
	final int a = 1;
	final int b;
	static final int c;
	
	static {
		c = 1;
	}
	public MyClass1(){
		
	}
	
//	MyClass1(){
//		b= 9;
//	}
	MyClass1(int i){
		b = 1;
	//	c = 2;
	}
	
	
}
