package ch05.lecture.p02reference;

public class C06Reference2 {
	public static void main(String[] args) {
		int a = 9;
		changeItems(a);
		System.out.println(a);
	}
	
	static void changeItems(int i) {
		System.out.println(i);
		// i= {3,4};
		i =  3;
	}
}
