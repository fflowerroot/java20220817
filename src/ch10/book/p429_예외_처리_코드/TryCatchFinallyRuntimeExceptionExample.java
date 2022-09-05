package ch10.book.p429_예외_처리_코드;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String d1 = null;
		String d2 = null;
		try {
			d1 = args[0];
			d2 = args[1];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다..");
			System.out.println("[실행 방법]");
			System.out.println("Java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
			
		}
		try {
			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			int result = v1 + v2;
			System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		}finally {  
			System.out.println("다시 실행하세요.");
		}
		System.out.println("next..");
	}
}
