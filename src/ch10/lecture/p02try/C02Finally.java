package ch10.lecture.p02try;

public class C02Finally {
	public static void main(String[] args) {
		int a = 1;
		int b = 2; 
		
		try {
			int c = a/b;
			int d = a/0;
		
			System.out.println("exception 발생 안해서 실행되는 코드..");
		}catch(ArithmeticException e) {
			System.out.println("exception 발생 해서 실행되는 코드..");
		}finally{
			System.out.println("exception 발생 여부 관계없이 실행되는 코드..");
		}
//		int c = a/b;
//		int d = a/0;

	}
}
