package exercise_fflowerroot.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
	

	    public int lastStoneWeight(int[] stones) {
//	        List<Integer> list = new ArrayList<>();
//	        for(int stone:stones){
//	            list.add(stone);
//	        }
//	        int max1=0;
//	        int max2=0;
//
//	        for(int stone : stones) {
//				max1 = stone>max1? stone:max1;
//			}
	    	int tmp = 0;
			for (int i = 0; i < stones.length; i++) {
				for (int j = 0; j < stones.length; i++) {
					if (stones[j] > stones[j + 1]) {
						tmp = stones[j];
						stones[j] = stones[j + 1];
						stones[j + 1] = tmp;
					}
			//		System.out.println(stones[i]);
				}
			}
	        List<Integer> list2 = new ArrayList<>();
	        for(int stone:stones){
	            list2.add(stone);
	        }
	        
	        for(int i =0; i<list2.size();i++) {
	        	if(list2.add(list2.size()-1))
	        }
			
	        
	        
	        
	        return max2;
	        
	    }
	

	public static void main(String[] args) {
		int[] ia = { 3, 2, 1 };

		List<Integer> l = targetIndices(new int[] { 1, 3, 2 }, 2);
		System.out.println(l);
		 int larger = Integer.MAX_VALUE;
		 int ii=ia.length; //?? ????????? length ??? ????????? ????????????... ?????????????????? ?????????.. ????????? ??????????
		 
		 int[]arr = new int[5];
		 Arrays.setAll(arr, );//IntUnaryOperator ??? ??????.. ??????
	}

}
//119 118 1200
