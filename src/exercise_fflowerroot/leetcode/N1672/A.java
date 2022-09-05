package exercise_fflowerroot.leetcode.N1672;

public class A {
	public static int maximumWealth(int[][] accounts) {
		int max = 0;

		for (int[] a : accounts) {
			int sum = 0;
			for (int b : a) {
				sum += b;
			}

			max = Math.max(max, sum);
		}

		return max;
	}
	public static void main(String[] args) {
		int[][]a= {{1,2},{2,3}};
		System.out.println(maximumWealth(a));
		
	}
}
