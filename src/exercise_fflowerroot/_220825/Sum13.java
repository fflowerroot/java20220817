package exercise_fflowerroot._220825;

public class Sum13 {
	public static void main(String[] args) {
		
		int[]nums= {1,2,3,13,1,2};
//		int sum = 0;
//
//		int before = 0;
//		for (int num : nums) {
//			if (num != 13 && before != 13) {
//				sum += num;
//			}
//			before = num;
//		}
//		System.out.println(sum);
		
		
		// ;;; 연산 괄호때문에...;
		int sum=0;
		  for(int i =0; i<nums.length;i++){
		    sum+=nums[i];
		  }
		  for(int i =0; i<nums.length;i++){
		   if(nums[i]==13 && i+1<nums.length){
			   System.out.println("sum="+sum);
		     sum=sum-nums[i]-nums[i+1];
		     System.out.println("(nums[i]-nums[i+1])="+(nums[i]-nums[i+1]));
		     System.out.println("nums[i]="+nums[i]);
		     System.out.println("nums[i+1]="+nums[i+1]);
		     System.out.println("sum="+sum);
		     i++;
		     System.out.println("i= "+i);
		   } else if(nums[i]==13){
		     sum= sum-(nums[i]);
		   }
		  }
		  System.out.println(sum);
	}
}
