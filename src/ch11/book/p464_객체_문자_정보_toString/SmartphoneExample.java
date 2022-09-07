package ch11.book.p464_객체_문자_정보_toString;

public class SmartphoneExample {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone("google", "andriod");
		System.out.println(p.toString());
		System.out.println(p);
	}
}
