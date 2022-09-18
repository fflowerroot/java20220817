package exercise_fflowerroot.leetcode;

import java.util.HashSet;
import java.util.Set;

public class n1512 {
	public static void main(String[] args) {
		System.out.println(numIdenticalPairs(new int[] { 1, 1, 2, 2, 1, 1 }));
	}

	public static int numIdenticalPairs(int[] nums) {
		Set<Integer> s = new HashSet<>();
		int sum = 0;
		for (int i : nums) {
			s.add(i);
		}

		for (int i : s) {
			int cnt = 0;
			for (int j : nums) {
				if (i == j) {
					cnt++;
				}
			}
			for (int k = 1; k < cnt; k++) {
				sum += k;
			}
		}
		return sum;
	}
}
