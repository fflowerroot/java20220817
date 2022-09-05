package ch10.book.p433_예외_종류에_따른_처리_코드;

import ch10.lecture.p01.C03ArrayIndexOutOfBoundsException;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String d1 = args[0];
			String d2 = args[1];
			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			int r = v1 + v2;
			
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		}catch(Exception e) {
			System.out.println("실행에 문제가 있습니다.");
			
		}finally {
			System.out.println("다시 실행하세요.");
		}
	}
}
