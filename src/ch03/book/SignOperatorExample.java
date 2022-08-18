package ch03.book;

public class SignOperatorExample {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println(result1 + result2);
		
		short s = 100;
	//	short result3 = -s;   sign(부호)도 연산자라서 int로 바뀜
		int result4 = -s;
		System.out.println(result4);

	}

}
