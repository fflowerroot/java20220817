package ch03.book;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println(result);
		System.out.println(1-7*0.1);
		System.out.println(1-0.7);

		// 결론 : 부동소수점타입은 정확한 값표현이 안되므로 계산은 정수로해서 소수를 만들어야 정확해진다.
		
	}
}
