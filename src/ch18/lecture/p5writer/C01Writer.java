package ch18.lecture.p5writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01Writer {
	public static void main(String[] args) throws Exception {
		//Writer : 문자단위로 출력하는 스트림
		//주요 메서드 : writer
		String fileName="C:\\Users\\user\\Desktop\\output\\output5.txt";
		Writer wr = new FileWriter(fileName);
		wr.write('a');
		wr.write('한');
		wr.write(9742);
		//파일 크기가 7바이트?
		wr.close(); // 닫지 않으면 파일에 안써짐
		
	}
}
