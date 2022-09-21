package ch18.lecture.p3exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C02Exception {
	public static void main(String[] args) {
		// 빨간줄이 있으면 try-catch로 처리가 안되는건가? 빨간 줄은 다 에러인가?
		String name = "C:\\Users\\user\\Desktop\\output\\output5.txt";
		OutputStream os = null;
		try { // try블럭 안에서 선언된 변수는 finally에서 사용 못함. 그래서 위에서 선언했음.
			os = new FileOutputStream(name1); // 이건 Exception이 아니라 '에러'라서 처리가 안되는건가?
			os.write(99);// 만약 exception 발생시 아래 close코드 실행되지 못함 / throws IOException 으로 처리하는 것은 안전하지 못함.  ?
			os.write(88);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				os.close();
				System.out.println("finally..");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // 지금 이 코드에서는 close()를 실행시키기위해서 finally블럭을 안써도 되지만(트라이문에 종료시키는 코드가 없어서), 만약 트라이문에 종료코드(예를들면 리턴)가 있으면 finally로 해결할 수 밖에 없음.
		
	}
}
