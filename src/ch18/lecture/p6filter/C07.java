package ch18.lecture.p6filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class C07 {
	public static void main(String[] args) throws Exception {
		String name = "C:\\Users\\user\\Desktop\\output\\output12.txt";
		String name2 = "C:\\Users\\user\\Desktop\\output\\output13.txt";
		try (
				InputStream is = new FileInputStream(name);
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				OutputStream os = new FileOutputStream(name2);
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw);
				) {
			String line = null;
			
			while ((line = br.readLine()) != null) {
//				System.out.println(line);
				bw.write(line);
				bw.write("\n");
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//---
		
//		String name2 = "C:\\Users\\user\\Desktop\\output\\output13.txt";
//		OutputStream os = new FileOutputStream(name2);
//		OutputStreamWriter osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
//		
////		for (int i = 0; i < 10000; i++) {
////			bw.write();
////		}
//		
//		bw.close();
//		osw.close();
//		os.close();
		
	}
}