package ch07.lecture.p02polymorphism;

public class C01Polymorphism {
	public static void main(String[] args) {
		
		//  자동형변환
		SubClass1 o1 = new SubClass1();
		SuperClass1 o2 = new SubClass1();
		SuperClass1 o3 = new SubClass2();
		SuperClass1 o4 = o1;
		
		// 자동형변환  x
//		SubClass1 o5 = o4;
	}
}
