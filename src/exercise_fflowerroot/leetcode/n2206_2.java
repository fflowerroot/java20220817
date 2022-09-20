package exercise_fflowerroot.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class n2206_2 {
	 public int numIdenticalPairs(int[] nums) {
			return Arrays.stream(nums)
					.boxed()
					.collect(Collectors.groupingBy(e -> e, Collectors.counting()))
					.values()
					.stream()
					.mapToInt(n -> n.intValue())
					.map(n -> n * (n - 1) / 2)
					.sum();
		}
}
