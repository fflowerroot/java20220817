package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class C06 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		InputStream os = new FileInputStream(name);
		InputStreamReader osw = new InputStreamReader(os);
		BufferedReader bw = new BufferedReader(osw);
		char[] buffer = new char[300];
		int len=0;
		for ((len=bw.read(buffer))!=-1) {
			 len=bw.read(buffer);
		//	bw.read("\n");
			System.out.println(len);
		}
		
		bw.close();
		osw.close();
		os.close();
	}
}
