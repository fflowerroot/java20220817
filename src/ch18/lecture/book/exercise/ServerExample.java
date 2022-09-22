package ch18.lecture.book.exercise;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket();
		ss.bind(new InetSocketAddress("172.30.1.15", 55000));
		Socket s = ss.accept();
		System.out.println("서버시작");

		String remoteAddress = s.getRemoteSocketAddress().toString();
		String clientIpAddress = remoteAddress.substring(0, remoteAddress.indexOf(':'));
		String folder = "C:\\Users\\user\\Desktop\\output\\temp";
		String fileName = folder + clientIpAddress.replace('.', '_') + ".jpg";

		while (true) {
			try {

				InputStream is = s.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				FileOutputStream fos = new FileOutputStream(fileName);
				BufferedOutputStream bos = new BufferedOutputStream(fos);

				byte[] buf = new byte[1000];
//				int readByteCount=-1;
				int len = 0;
				int fileSize = 0;
				while ((len = bis.read(buf)) != -1) {
					fileSize += len;
					bos.write(buf, 0, len);
				}

				// fileName=fileName.trim();
				System.out.println("파일 받기 시작 ");

				System.out.println("파일 받기 완료");

				fos.close();
				is.close();
				s.close();
			} catch (Exception e) {
				break;
			}
		}
		ss.close();
		System.out.println("서버종료");
	}
	//local host는 네트워크를 타지 않음. 바로 옴.
	//

}
