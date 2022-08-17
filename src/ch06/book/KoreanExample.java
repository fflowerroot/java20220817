package ch06.book;

public class KoreanExample {

	public static void main(String[] args) {
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		Korean k2 = new Korean("김자바","930555-1234567");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println(k2.nation);
		
		k2.nation = "미국";
		System.out.println(k2.nation);
	}

}
