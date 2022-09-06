package exercise_fflowerroot.baekjoon;

import java.util.Scanner;

public class N2588_곱셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();

		int i1 = input1 * (input2 % 10);
		int i2 = input1 * (input2 % (100) - input2 % 10);
		int i3 = input1 * (input2 / 100);
		int i4 = input1 * input2;
		System.out.println(i1);
		System.out.println(i2 / 10);
		System.out.println(i3);
		System.out.println(i4);
	}
}
