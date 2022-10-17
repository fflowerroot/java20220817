package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ㅠㅠ {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] s = new String[N];
		for(int i =0;i<N; i++) {
			s[i]= br.readLine();
		}

		int score = 0;
		int sum = 0;
		int result = 0;
		for (int i = 0; i < N; i++) {	
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'X') {
					result += sum;
					sum = 0;
					score = 0;
				} else if (s[i].charAt(j) == 'O' && (j == 0 || s[i].charAt(j - 1) == 'X')) {
					score = 1;
					sum += score;
					if (j == s[i].length() - 1) {
						result += sum;
						sum = 0;
						score = 0;
					}

				} else if (s[i].charAt(j) == 'O' && s[i].charAt(j - 1) == 'O') {
					score += 1;
					sum += (score);
					

					if (j == s[i].length() - 1) {
						result += sum;
						sum = 0;
						score = 0;
					}
				}
			}
			System.out.println(+result);
			result = 0;
		}
	}
}
