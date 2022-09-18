package exercise_fflowerroot.leetcode;

public class n2006 {
	public static void main(String[] args) {
		System.out.println(countKDifference(new int[] { 1, 2, 2, 2, 3, 4 }, 1));
	}

	public static int countKDifference(int[] nums, int k) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (Math.abs(nums[i] - nums[j]) == k) {
					cnt++;
					System.out.println(i + "," + j);
				}
			}
		}
		return cnt;
	}
}
