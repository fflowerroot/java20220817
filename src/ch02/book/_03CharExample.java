package ch02.book;

public class _03CharExample {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';    
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';

		int uniCode = c1; 
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(uniCode);
		System.out.println((int)c2);
		System.out.println((int)c3);
		System.out.println((int)c4);
		System.out.println((int)c5);
		System.out.println((int)c6);
		System.out.println((char)44941);
		System.out.println((char)0xaf8d);  // 0x는 숫자형 16진법
		System.out.println('\uaf8d');	   // '\u'는 문자형 16진법
		
		// 2byte가 넘어가지 않는 유니코드 java로 표현 가능
		char k ='\u270d';
		System.out.println('\u270d');  //이모티콘 출력
		
		
	
	}

}
