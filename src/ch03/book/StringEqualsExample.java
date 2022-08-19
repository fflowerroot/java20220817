package ch03.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		String s1 = "신민철";
		String s2 = "신민철";
		String s3 = new String("신민철");
	
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(!s1.equals(s3));
		
		
	}
}
