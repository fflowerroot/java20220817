package ch04.book;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;

		if (score >= 90) {
			System.out.println("a");
		}
		if (score < 90)
			System.out.println
			("b"); 	// if문에서 {}생략은 실행코드가 한문장일때 가능.
		System.out.println("b");

	}
}
