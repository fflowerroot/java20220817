package exercise_fflowerroot.leetcode.N1672;

import java.util.Arrays;

public class Solution {
	public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(i -> Arrays.stream(i).sum()).max().getAsInt();
    }
	
	public static void main(String[] args) {
		int[][]a= {{1,2},{2,3}};
		System.out.println(maximumWealth(a));
		
	}
}
