package ch18.lecture.p7network;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class C04Client {
	public static void main(String[] args) {
		try (Socket s = new Socket("172.30.1.15", 30000);
		) {
			System.out.println("연결됨");
			System.out.println(s.getRemoteSocketAddress());
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(osw);
			PrintWriter pw = new PrintWriter(bw);
			Scanner sc = new Scanner(System.in);
			try (os; osw; bw; pw) {
			//	System.out.println("message");
			//	pw.print("message입니다");
				String data ="";
				while(!data.equals("Bye~")) {
					System.out.print("입력> ");
					data=sc.nextLine();
					pw.println(data); // 상대가 println으로 했는데 print로 하면 안됨
					pw.flush();
				}
			} catch (Exception e) {

			}
		} catch (Exception e) {

		}
	}
}
