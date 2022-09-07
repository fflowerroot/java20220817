package ch11.book.p498_String_메소드;

public class StringLengthExample {
	public static void main(String[] args) {
		String ssn = "7306241230123";
		int length = ssn.length();
		if(length==13) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}
}
