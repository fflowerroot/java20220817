package exercise_fflowerroot.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class A {
	public static void main(String[] args) {
		int[] nums = { 3, 2,2, 1 };
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = 0; j < nums.length-1; j++) {
				int tmp = 0;
				if (nums[j] > nums[j + 1]) {
					tmp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = tmp;
				}
				System.out.println(nums[j]);
				System.out.println(Arrays.toString(nums));
			}
		}
		
        List<Integer> l = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            if(nums[i]==2){
                l.add(i);
            }
        } 
        System.out.println(l);

        //		3 2 1
        //		2 1 3
        //	5 4 3 2 1
        // 	4 3 2 1 5
        //	
        //  1 4 5

	}
}







