package ch11.book.p496_String메소드;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책..");
		} else {
			System.out.println("자바와 관련 없을 수 있습니다.");
		}

	}
}
