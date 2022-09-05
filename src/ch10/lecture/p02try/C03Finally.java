package ch10.lecture.p02try;

public class C03Finally {
	public static void main(String[] args) {
		try {
			int a = 3 / 3;
			if (a == 1) {
				return;
			}
		} catch (ArithmeticException e) {
			System.out.println("exception..");
		} finally {
			System.out.println("finally.."); //return 키워드가 함수를 종료시켜도 실행되는  finally block!!
		}
		System.out.println("try  block  의 코드..??"); //exception 발생도 안했는데 왜 실행 안됨?? 
		System.out.println("try  block  의 코드..??"); //   >> return이 main함수를 종료시킴!!
	}
}
