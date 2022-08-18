package ch02.book;

public class OperationspromotionExample {

	public static void main(String[] args) {
		// 빈 문자라는건 없음. 빈 문자열은 있음
		String aa = "";
	//	Char aaa = '';
		byte b1 = 10;
		byte b2 = 20;
	//	byte b3 = b1 + b2;
		int i1 = b1 + b2;
		
		char c1 ='a';
		char c2 = 'b';
	//	char c3 = c1 + c2;
		System.out.println((char)(c1+c2));
		
		int i2 = 10;
		int i3 = i2/4;  //결과가 int라서 나머지 버려짐 !!
		System.out.println(i3);
		
		int i4 = 10;
	//	int i6 = 10/2.0;  //int랑 doubel이랑 연산하면 double됨
		System.out.println((10/2.0));
		
		int w = 5;
		double c= (double)w;
		System.out.println(w);
		System.out.println(c);
		
//		int $i 
		short e = 'r';
		char c22 = ' ';
//		e = c22;
		c22= ' ';
//		e= c22;
//		e = '가';
		
		char c33 = ' ';
		char c44 = (char)(c33);
		
		String s = "a";
//		c44 = (char)(s);
		
//		c44 = strValue.charAt(""); ??

//		int class = 3;
		
		float ff = 1234567890123456789L;
		System.out.println(ff); // 1234567940000000000
								// 1234567890123456789
		
		
		
	}

}
