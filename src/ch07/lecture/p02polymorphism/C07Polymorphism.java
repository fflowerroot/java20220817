package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	// 중요 ! 실제 인스턴스의 메서드가 호출됨
	public static void main(String[] args) {
		SuperClass4 o1 = new SuperClass4();
		o1.method1();
		o1.method2();
		o1.method3();
		System.out.println();

		SubClass41 sub41 = new SubClass41();
		sub41.method1();
		sub41.method2();
		sub41.method3();

		System.out.println();

		SuperClass4 o3 = new SubClass41();
		o3.method1();
		o3.method2();
		o3.method3();

		System.out.println();

		SuperClass4 o4 = new SubClass42();
		o4.method1();
		o4.method2();
		o4.method3();
		
		someMethod(sub41);
		
//		SubClass41 sub1 = new SubClass42(); 
//		SubClass41 sub2 = new SuperClass41();
		SuperClass4 super1 = new SubClass41();
		sub41 = (SubClass41)super1;
	}  // 형제끼리는 강제형변환할 일이 없음. 
	   //왜냐하면 형제끼리는 서로의 타입에 서로의 인스턴스를 넣을 수가 없기때문에.

	public static void someMethod(SubClass41 o) {
		System.out.println("someMethod1()..");
		o.method1();
		o.method2();
		o.method3();

	}
}


















