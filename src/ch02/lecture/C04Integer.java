package ch02.lecture;

public class C04Integer {
	public static void main(String[] args) {
		byte a = 0;
		byte b = 127;
		byte c = -128;
	//	byte d = 128;    // byte 저장공간을 넘음
	//	byte e = -129;   // byte 저장공간을 넘음
		
		
		/* 
		  0111_1111 == 127
		  0111_1111 + 1 == 1000_0000
		  1000_0000 == -128
		  1000_0001 == -127
		  1000_0010 == -126
		  1000_0011 == -125
		  1000_0100 == -124
		  ...
		  1111_1111 == -1
		  1111_1111 + 1 == 0000_0000
		  0000_0000 == 0 
		  
		 */
		
		
		
		/* 정수 literal은 int로 취급
		   int 범위를 넘어갈 때는 long 타입으로 표시 (L)
		   작성하는 수가 클 때는 _와 조합 가능
		 */
		
		
		int s = 2147483647;
		int t = s + 1;
		System.out.println(t);   // 결과값이 -2147483648   >> overflow되었기 때문에
				
}
}







































