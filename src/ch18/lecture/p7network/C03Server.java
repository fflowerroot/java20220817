package ch18.lecture.p7network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Server {
	public static void main(String[] args) {
		try (ServerSocket sc = new ServerSocket(30000);
				Socket s = sc.accept();) {
			System.out.println("연결 완료");
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);

			try (is; isr; br) {
				String line = "";
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
			}

			System.out.println("연결 종료");

		} catch (Exception e) {

		}
	}
}
