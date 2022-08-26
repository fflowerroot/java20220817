package ch04.book;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'a';

		switch (grade) {
		case 'a':
		case 'A':
			System.out.println("vip");
			break;
		case 'b':
		case 'B':
			System.out.println("member");
			break;
//		case'c':
//		case'C':
//			System.out.println("guest");
		default:
			System.out.println("guest");

		}
	}
}
