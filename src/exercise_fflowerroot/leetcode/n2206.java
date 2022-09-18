package exercise_fflowerroot.leetcode;

import java.util.stream.IntStream;

public class n2206 {
	public static void main(String[] args) {
		
	}
	
    public boolean divideArray(int[] nums) {
        int[] cnt = new int[501];
        for (int n : nums)
            ++cnt[n];
        return IntStream.of(cnt).allMatch(n -> n % 2 == 0);
    }

}
