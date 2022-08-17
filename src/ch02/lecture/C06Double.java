package ch02.lecture;

public class C06Double {
	public static void main(String[] args) {
		/* 실수형 float와 double
		 
		 * float  :   4byte
		 * double :   8byte
		    >> double이 좀 더 정교한 표현 가능
		    
		- 실수 literal은 double형
		- float literal 표현은 끝에 F 붙임    
		 
		 */
		
		
		float a = 1.234567890123456F;
		double b = 1.234567890123456;
		
		System.out.println(a);
		System.out.println(b);
		
		double c = 0.1;
		double d = 0.2;
		System.out.println(c);
		System.out.println(d);
		System.out.println(c+d);
		/* 10진법을 2진법으로 표현할 때 근사값으로밖에 표현할 수 없기 때문에 정확한 결과가 저장되지 않는다
				(컴퓨터에 저장할 때 2진수로 저장해야 하기때문에) */
	}
}
