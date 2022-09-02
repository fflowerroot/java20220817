package ch09.lecture.p02lambda;

public class MyClass6 {

public static void main(String[] args) {
	MyInterface6 o1 = () -> {
		int i = (int)(Math.random()*6)+1;
		return i;
	};
	System.out.println(o1.m());
}	

}
interface MyInterface6 {
	int m();
}
