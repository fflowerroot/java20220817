package ch18.lecture.p7network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class C06Client {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\user\\Desktop\\output\\오징어.jpg";
		try (
				Socket s = new Socket("172.30.1.15", 55000);
				
				FileInputStream fis = new FileInputStream(fileName);
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				OutputStream os = s.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);) {
			
			byte[] buffer = new byte[1000];
			int len = 0;
			while ((len = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, len);
			}
			bos.flush();
			System.out.println("전송완료");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
