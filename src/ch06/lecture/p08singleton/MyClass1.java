package ch06.lecture.p08singleton;

public class MyClass1 {
//	MyClass1 instance = new MyClass1();
	static  MyClass1 instance = new MyClass1();
		//생성자가 private이기떄문에 이 클래스 내부에서만 객체생성가능해서 여기서 생성함.
		//메서드가 cm이니까 메서드의 반환값이 이 인스턴스도 cv여야함. 
	private MyClass1() {	
	}

//	public  MyClass1 getInstance(){
	static public  MyClass1 getInstance(){
		return instance;  
	} 
} // 결론은 생성자가 private이기때문에 이 메서드를 im으로 만들면 쓸 수가 없으니까 cv로 만들어야함.

