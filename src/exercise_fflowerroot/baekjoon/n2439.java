package exercise_fflowerroot.baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n2439 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j > i; j--) {
				bw.write(" ");
			}
			for (int j = -1; j < i; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}

		br.close();
		bw.flush();
		bw.close();

	}
}