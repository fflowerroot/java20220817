package ch09.lecture.p02lambda;

public class MyClass7 {
	public static void main(String[] args) {
		MyInterface7 o1 = ii -> ii * 2; //return  keyword  생략
		System.out.println(o1.m(3));
	}
	
	
}
@FunctionalInterface
interface MyInterface7{
	int m(int i);
	int m2(int i);
}
