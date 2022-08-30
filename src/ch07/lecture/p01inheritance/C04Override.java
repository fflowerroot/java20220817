package ch07.lecture.p01inheritance;

public class C04Override {
	public static void main(String[] args) {
		Object o1 = new Object();
		String o2 = new String();

		System.out.println(o1.hashCode());// 참조값
		System.out.println(o2.hashCode());// override(재정의)된 메소드 리턴값
		
		System.out.println(System.identityHashCode(o1)); //참조값
		System.out.println(System.identityHashCode(o2)); //참조값
		
		//string의 hashCode메서드는 Object의 hashCode메서드를 override 했다.
		
	}
}
