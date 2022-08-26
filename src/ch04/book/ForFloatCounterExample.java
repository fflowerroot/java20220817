package ch04.book;

public class ForFloatCounterExample {
	public static void main(String[] args) {
		
		float x=0.1f;
		for( x=0.1f; x<=1f; x+=0.1f) {
			System.out.println(x);
			}
		/* float는 정수처럼 정확한 값을 2진수로 변경할 수 없기 때문에
			이런 결과가 나온다
			결론은 실수타입을 쓰는 것을 자제하자	*/
			System.out.println("Now x is " +x);
	
	
	}
}
