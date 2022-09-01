package ch08.lecture.p01interface;

public class C01Interface {
	public static void main(String[] args) {
		// 상속과 똑같음. MyClass1 is a MyInterface1.
		// 상속과 다른점은 다중상속은 안되지만  interface 여러개를 상속받을 수 있다!
		MyClass1 o1 = new MyClass1();
		MyInterface1 o2 = o1;
		
		MyClass2 o3 = new MyClass2();
		MyInterface1 i = o3;
		MyInterface2 i2 = o3;
		
				
	}
}
//public class A{
//	
//}    //cf ) 하나의 .java file에 두개이상의 public class 못쓰나봄.
