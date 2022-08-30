package ch06.lecture.p08singleton;

public class C01Singleton {
	public static void main(String[] args) {
//		MyClass1 o1 = new MyClass1();
//		MyClass1 o2= new MyClass1();
		
		instance.getInstance(); // main 메서드가 static이니까 객체 생성안하고 iv못씀.
	
		System.out.println(o1);
		System.out.println(o2);
		
	}
	instance.getInstance(); // method 밖에서는 method호출 못해..
	
	void method1() {
		instance.getInstance(); 
	     // 여기서는 왜 안돼? >> 외부클래스니까 클래스멤버가 아니니까 객체생성해야지..
		
		MyClass1.getInstance();
	}
}
