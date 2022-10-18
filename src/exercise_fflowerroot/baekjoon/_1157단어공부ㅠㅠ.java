package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.util.Arrays;

public class _1157단어공부ㅠㅠ { //반례를 못찾겠음...
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// Mississipi
		// 대문자: 65~90
		// 소문자: 97~122
		byte[] bA0 = new byte[26];

		byte[] bA = br.readLine().getBytes();
		// System.out.println(Arrays.toString(bA));

		for (byte by : bA) {
			if (by <= 90) {
				bA0[by - 65]++; // 대문자
//				System.out.println("c1 : "+bA0[by-65]);
//				System.out.println((char)by);
			} else if (by >= 97) { // 소문자랑 대문자 차이가 32
				// System.out.println(bA0[(byte)by]);
				bA0[(byte) by - 32 - 65]++; // 소문자
//				System.out.println("c2 : "+bA0[by-32-65]); 
//				System.out.println((char)by);
			}
		}
		System.out.println(Arrays.toString(bA0));

		int max = 0;
		int index = 0;
		char res = '?';
		int cnt=0;
		for (int i = 0; i < bA0.length; i++) {
			if (bA0[i] > max) {
				max = bA0[i];
				index = i;
				res = (char) (index + 65);
			//	System.out.println("max,index,res  :  " + max + "," + index + "," + res);
			//	System.out.println("C1");
			}
//			else if(bA0[i]==max&&bA0[i]!=0){
//				 res='?';	 
//			 System.out.println("bA0[i],max  : "+bA0[i]+","+max);
//				 System.out.println("C2");
//				 break;
		}
		for(byte b: bA0) {
			if(b==max) {
			 cnt++;
			}
		}
		if(cnt>1) 	res='?';
		System.out.println(res);
	}
}





















