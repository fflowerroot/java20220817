package ch03.lecture.p2binary;

public class C07Logical {
	public static void main(String[] args) {
		/*	논리연산자	: 피연산자도 boolean, 연산결과도 boolean
		  	 and  &&, &
		  	 or	||, |
		  	 xor	^
		  	 not	!
		  */
		
		
		// xor		:  	'exclusive or'로 boolean 값이 서로 다를 때만 true
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^true);
		System.out.println(false^false);
		
	}

}
