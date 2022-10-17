package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _질문 {

	private static int T;
	private static int repeat; 
	private static char[] chArray, resultArray;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		T = Integer.parseInt(br.readLine());
		
		for(int t = 1 ; t <= T ; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			repeat = Integer.parseInt(st.nextToken());
			chArray = st.nextToken().toCharArray();
			
			resultArray = new char[repeat*chArray.length];
			
			setData();
			print(bw);
			System.out.println(); //?? 왜 이게 먼저 실행됨?
		}
		bw.flush();
		bw.close();
		
	}
	
	private static void setData() {
		int index = 0;
		for(int i = 0 ; i < chArray.length ; i++) {
			for(int j = 0 ; j < repeat ; j++) {
				resultArray[index++] = chArray[i];
			}
	}
//		System.out.println(Arrays.toString(resultArray));
	}
	
	
	private static void print(BufferedWriter bw) throws Exception {
		for(int i = 0 ; i < resultArray.length ; i++) {
			bw.write(String.valueOf(resultArray[i]));
		}
	//	bw.newLine();
	}
}
