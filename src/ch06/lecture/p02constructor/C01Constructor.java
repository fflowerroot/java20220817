package ch06.lecture.p02constructor;

public class C01Constructor {
	public static void main(String[] args) {
		MyClass1 o1=new MyClass1();
		o1.name="maverick";
		
		MyClass1 o2 = new MyClass1("MuMu");
	
		System.out.println(o2.name);
		o2.name="maverick2";
		
		System.out.println(o2.name);
		
		int a;
		System.out.println(a);
	}
}
