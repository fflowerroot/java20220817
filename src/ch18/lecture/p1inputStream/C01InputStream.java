//퀱
package ch18.lecture.p1inputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class C01InputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/ch18/lecture/p1inputStream/C01InputStream.java";
		InputStream is = new FileInputStream(path);
		//Default constructor cannot handle exception type FileNotFoundException thrown by implicit super constructor. Must define an explicit constructor
		
		int r1=is.read(); // 영문자 한 글자를 읽어서 반환함. // 1바이트가 넘어가는 한글은 잘려서 반환됨.? >> char로 형변환해서 출력할 때 올바르게 출력안되는데
					//  그 이유가 인트로 1바이트는 -128~127까지이고 char는 255까지 표현되는거에 기반한건가?.. 아무튼 한글은 2바이트씩 잡아야 해서 발생하는 문제라는데 오류의 메커니즘을 모르겠음. 아무튼 리드한걸 출력할 때, 한글은 Reader/Writer객체를 만들어서 작성해야함..
		int r2=is.read();
		int r3=is.read();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
	}

}
