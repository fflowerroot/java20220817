package ch18.lecture.p7network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class C07HttpServer {
	public static void main(String[] args) {
		//항상 연결을 기다리고 있는 서버.
		
		try(	ServerSocket server= new ServerSocket(8000);
				Socket socket = server.accept();
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintWriter pw = new PrintWriter(bos);){
			
			//프로토콜대로 작성-----
			String data="<h1>내일부터 jsp</h1>";
			pw.println("HTTP/1/1 200 OK");
			pw.println("Content-Type: text/html; charset=utf-8");
			pw.println("Content-Length: "+data.getBytes().length);
			pw.println();
			pw.println(data); //우리가 배울건 이 data를 만드는 방법
		}catch(Exception e) {
			e.printStackTrace();
		}

	
		
	}
}
