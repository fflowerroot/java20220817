package ch18.lecture.p7network;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C05Server {
	public static void main(String[] args) {
		try (ServerSocket ss = new ServerSocket(55000);
				Socket s = ss.accept();
				InputStream is = s.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);) {
			String ra =s.getRemoteSocketAddress();
			byte[] buf = new byte[1000];
			bis.read(buf);
			int len = 0;
			int fileSize = 0;
			while ((len = bis.read(buf)) != -1) {
				fileSize += len;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
