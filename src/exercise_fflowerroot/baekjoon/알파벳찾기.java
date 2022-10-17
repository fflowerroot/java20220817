package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 알파벳찾기 {
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			char arr[] = br.readLine().toCharArray();
			int num[] = new int[26];
			for (int i = 0; i < 26; i++) {
				num[i] = -1;
			}
			//beakjoon
			//-1 -1 -1 -1 -1 -1 -1 ..-1 -1 -1
			//System.out.println((int)'a');
			
//			for (int i = 0; i < arr.length; i++) {
//				int loc = arr[i] - 97;// -1이 26개가 들어있는 배열의 위치   // b-97=1      //a=97 b=98...
//			if(num[loc]==-1)// !! -1이 아니면 이미 그 전에 위치가 기록된 것이므로!. 문제에서는 처음 나오는 위치를 기록하라고 했으므로.
//				num[loc] = i; // 그 위 치에 단어에서 알파벳 위치를 넣음
//			}
			
			
			for (int i = 0; i < arr.length; i++) {
	//			int loc = arr[i] - 97;// -1이 26개가 들어있는 배열의 위치   // b-97=1      //a=97 b=98...
			if(num[arr[i] - 97]==-1)// !! -1이 아니면 이미 그 전에 위치가 기록된 것이므로!. 문제에서는 처음 나오는 위치를 기록하라고 했으므로.
				num[arr[i] - 97] = i; // 그 위 치에 단어에서 알파벳 위치를 넣음
			}
			
			
			
			for (int i = 0; i <  26; i++) {
				System.out.print(num[i] + " ");
			}
			
		}
	}













