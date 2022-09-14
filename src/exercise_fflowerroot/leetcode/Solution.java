package exercise_fflowerroot.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
//	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//		List<Boolean> l = new ArrayList<>();
//
//		for (int i = 0; i < candies.length; i++) {
//			if (candies[i] + extraCandies>1 ) {
//				l.add(true);
//			} else {
//				l.add(false);
//			}
//		}
//		return l;
//	}

	public static List<Integer> targetIndices(int[] nums, int target) {
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; i++) {
				if (nums[j] > nums[j + 1]) {
					tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
				System.out.println(nums[i]);
			}
		}
	

		List<Integer> l = new ArrayList<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				l.add(nums[i]);
			}
		}
		return l;
	}
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> l = new ArrayList<>();
		int max = 0;
		for(int i : candies) {
			max = i>max? i:max;
		}
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies > max) {
				l.add(true);
			} else {
				l.add(false);
			}
		}
		return l;
	}

	public static void main(String[] args) {
		int[] ia = { 3, 2, 1 };

		List<Integer> l = targetIndices(new int[] { 1, 3, 2 }, 2);
		System.out.println(l);
		 int larger = Integer.MAX_VALUE;
		 int ii=ia.length; //?? 여기서 length 는 배열의 필드인데... 배열클래스는 없는데.. 어디서 관리됨?
		 
		 int[]arr = new int[5];
		 Arrays.setAll(arr, );//IntUnaryOperator 가 뭐지.. ㅠㅠ
	}

}
