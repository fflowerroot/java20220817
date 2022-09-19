package exercise_fflowerroot.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class n1512 {
	public static void main(String[] args) {
		System.out.println(numIdenticalPairs(new int[] { 1, 1, 2, 2, 1, 1 }));
		System.out.println(numIdenticalPairs2(new int[] { 1, 1, 2, 2, 1, 1 }));
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
	
	
	public static int numIdenticalPairs2(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (map.containsKey(num)) {
				// 이미 있었으면
				Integer val = map.get(num);
				map.put(num, val + 1);
			} else {
				// 처음
				map.put(num, 1);
			}
		}

		int result = 0;

		for (Integer n : map.values()) {
			Integer r = (n - 1) * n / 2;
			result += r;
		}

		return result;
	}
}
