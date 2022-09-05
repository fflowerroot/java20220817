package ch10.book.p433_예외_종류에_따른_처리_코드;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String s = args[0];
			String ss = args[1];
			int i = Integer.parseInt(s);
			int ii = Integer.parseInt(ss);
			int r = i+ii;
		
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수 부족 | 숫자로 변환 불가");
		}catch(Exception e) {
			System.out.println("알 수 없는 예외 발생");
		}finally {
			System.out.println("finally..");
		}
		System.out.println("next..");
	}
}
