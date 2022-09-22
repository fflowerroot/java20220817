package ch18.lecture.p7network;

import java.io.IOException;
import java.net.Socket;

public class C02Client {
	public static void main(String[] args) {
		// Client는 Sever가 기다린다는 가정 하에 작성.
		// Client : Socket 생성 후 연결 요청
		
		System.out.println("연결시도");
		try (Socket s = new Socket("172.30.1.51", 52000);) {
			// 입출력 스트림 꺼내서 일함
			System.out.println(s.getRemoteSocketAddress());
			System.out.println("연결종료..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
