package ch04.book.exercise;

public class Exercise06 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(String i="*"; i.equals("******")==false; i+="*" ) {
			System.out.println(i);
		}
//		for(String i="*****"; i.equals("******")==false; i+="*" ) {
//			System.out.println(i); // 문자열 지우는 함수 알아야..
//		}
		
		System.out.println("*****".equals("*****"));
	
}}
