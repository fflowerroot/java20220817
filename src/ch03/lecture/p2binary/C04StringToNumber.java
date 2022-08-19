package ch03.lecture.p2binary;

public class C04StringToNumber {
	public static void main(String[] args) {
		String a ="10";
		int b = 30;
		System.out.println(a+b);
		
		System.out.println(Integer.valueOf(a)+b);
		System.out.println( Double.valueOf("3.14"+9.9) );
		System.out.println(Double.valueOf("NaN")+1);
		
		// 더블에는 숫자 뿐만 아니라 Nan과 Infinity도 있어
		
		/* 기본타입과 매치되는 참조타입!
		 *  byte    :		Byte
		 *  short	:		Short
		 *  int		:		Integer
		 *  long	:		Long
		 *  double	:		Double
		 *  float	:		Float
		 *  char	: 		Charater
		 *  boolean :		Boolean  */
	}
}
