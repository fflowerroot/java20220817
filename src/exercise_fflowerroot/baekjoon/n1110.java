package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n1110 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		int a=n/10;
		int b=n%10;
		int r=-1;
		int cnt=0;
		
		while(r!=n) {
			int c=a+b;
			r= c%10+b*10;
			cnt++;
		}
		
		bw.write(cnt);
			
		
		// 26 
		// 08 68                                  
		// 14 84
		// 12 42
		// 06 26
		
		
		br.close();
		bw.flush();
		bw.close();
//		StringTokenizer st;
// 
//		for (int i = 1; i <= N; i++) {
//			st = new StringTokenizer(br.readLine()," ");
//			int a=Integer.parseInt(st.nextToken());
//			int b= Integer.parseInt(st.nextToken());
//			bw.write("Case #"+i+": "+a +" + " +b+" = "+(a+b) +"\n");
//			
	}

}
