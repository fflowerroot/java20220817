package exercise_fflowerroot.leetcode;

public class A {
	static int a =1;
	static char aa ='a';
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
		
//		int[][]a= {{1,2},{2,3}};
//		System.out.println(maximumWealth(a));
		A aa = new A();
//		A.a.
		a=1;
	}
}
