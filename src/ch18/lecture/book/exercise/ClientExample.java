package ch18.lecture.book.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception{
		String filePath="C:\\Users\\user\\Desktop\\output\\오징어.jpg";
		File f = new File(filePath);
		String fileName= f.getName();
		
		
		Socket s =new Socket("172.30.1.15",55000);
		
		OutputStream os = s.getOutputStream();
		BufferedOutputStream bos= new BufferedOutputStream(os);
		
		FileInputStream fis = new FileInputStream(f);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
	
		System.out.println("파일 보내기 시작 -- "+fileName );
		
		byte[] buffer = new byte[100];
		int len = 0;
		while ((len = bis.read(buffer)) != -1) {
			bos.write(buffer, 0, len);
			fileName.getBytes(0, fileName.length(), buffer, len);
		}
		
		os.flush();
		System.out.println("파일보내기 완료");
		
		fis.close();
		bos.close();
		bis.close();
		os.close();
		s.close();
}
	
}





