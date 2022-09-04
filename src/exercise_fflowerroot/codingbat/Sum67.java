package exercise_fflowerroot.codingbat;
//********codingbat Array-2 >> Sum67
//  이중포문으로는 방법이 없는건가?????
public class Sum67 {
	public static void main(String[] args) {
	//	int[] nums = { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 };
	//	int[]nums= {2, 7, 6, 2, 6, 7, 2, 7};    //18
		int[]nums= {1, 6, 2, 2, 7, 1, 6, 99, 99, 7};

		int sum = 0;
		int i = 0;
		int j = i + 1;
		

		for(;j < nums.length;j++) {
			i=j;
		for (; i < nums.length; i++) {
			if (nums[i] != 6) {
				sum += nums[i];
			} else {
				break;
			}
		}

		//int j = i + 1;
		//System.out.println("j = " +j);
		
		if (j < nums.length) {
			for (; j + 1 < nums.length; j++) {
				if (nums[j] == 7) {
					for (j=j; j + 1 < nums.length; j++) {
					sum += nums[j+1];
				}
			}
		}
	//	System.out.println("j = "+j);
		System.out.println(sum);
	//}
		System.out.println("j = "+j);	
		System.out.println("i = "+i);
}
}}}
