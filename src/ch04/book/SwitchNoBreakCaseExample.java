package ch04.book;

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int t = (int) (Math.random() * 4 + 8);
		System.out.println("It's" + t);

		switch (t) {
		case 8:
			System.out.println("going to work");
		case 9:
			System.out.println("meetting");
		case 10:
			System.out.println("working");
		default:
			System.out.println("going to buseness");
		}
	}
}
