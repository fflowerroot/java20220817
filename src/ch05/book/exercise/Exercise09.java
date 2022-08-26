package ch05.book.exercise;

import java.util.*;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studemtNum = 0;
		int[] scores = null;
		int sum = 0;
		// int count=0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.println("선택 > ");

			int selecNo = scanner.nextInt();

			if (selecNo == 1) {
				studemtNum = scanner.nextInt();
				System.out.println("입력하신 학생 수 : "+studemtNum);

			} else if (selecNo == 2) {

				scores = new int[studemtNum];
				for (int i = 0; i < studemtNum; i++) {
					System.out.print("score["+i+"] > ");
					scores[i] = scanner.nextInt();
					sum += scores[i];
				}
				System.out.println("점수 입력을 완료하였습니다.");

			} else if (selecNo == 3) {

	//			System.out.println(Arrays.toString(scores));
				System.out.println("=======================================");
				System.out.print("{ ");
				for(int i=0;i<studemtNum-1;i++) {
				System.out.print(scores[i]+", ");   
				}
				System.out.print(scores[scores.length-1]);
				System.out.println(" }");
				System.out.println("=======================================");
				System.out.println();
			} else if (selecNo == 4) {
				int h = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > h) {
						h = scores[i];
					}
				}
				avg = (double) sum / studemtNum;
				System.out.println("=================================");
				System.out.println("평균	:	" + avg);
				System.out.println("최고점 	: 	" + h);
				System.out.println("=================================");

			} else if (selecNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}
	}
}
