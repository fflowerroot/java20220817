package ch18.lecture.p7network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class C01Server {
	public static void main(String[] args) {
		System.out.println("연결 기다림");
		// 172.30.1.15:60000
		try (ServerSocket ss = new ServerSocket(60000);
				Socket s = ss.accept();) {
			System.out.println(s.getRemoteSocketAddress());
			System.out.println("연결 종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
