package exercise_fflowerroot._220825;

public class Sum67_2 {
	public static void main(String[] args) {
//		int[] nums = { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 };
//	    int[]nums= {2, 7, 6, 2, 6, 7, 2, 7};    //18
		int[]nums= {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};
		
//		int i =0;
//		int sum=0;
//		
//		
//		for(i=i; i<nums.length;i++) {
//			if(nums[i]==6) {
//				i++;
//				if(nums[i]==7) {
//					
//				}else if(nums[i]!=7) {
//					sum+=nums[i];
//				}
//			}else if(nums[i]!=6) {
//				sum+=nums[i];
//			}
//		}
//		System.out.println(sum);
		
		int sum = 0;

		boolean stop = false;

		for (int num : nums) {
			if (num == 6) {
				stop = true;
			}

			if (!stop) {
				sum += num;
			}

			if (num == 7) {
				stop = false;
			}
		}

		System.out.println(sum);
	}
		
	}

