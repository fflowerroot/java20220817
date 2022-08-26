package ch05.book;

public class StringEqualsExample {
	public static void main(String[] args) {
		String s1="신";
		String s2="신";
		String s3=new String("신");
		String s4=new String("신");
		
		System.out.println("---s1과 s2 비교---");
		if(s1==s2) {
			System.out.println("참조하는 객체가 같음");
		}else {
			System.out.println("참조하는 객체가 다름");
		}
		
		if(s1.equals(s2)) {
			System.out.println("문자열의 내용이 같음");
		}else {
			System.out.println("문자열의 내용이 다름");
		}
		System.out.println();
		
		
		System.out.println("---s3와 s4 비교---");
		if(s3==s4) {
			System.out.println("참조하는 객체가 같음");
		}else {
			System.out.println("참조하는 객체가 다름");
		}
		
		if(s3.equals(s4)) {
			System.out.println("문자열의 내용이 같음");
		}else {
			System.out.println("문자열의 내용이 다름");
		}
		
	}
}
