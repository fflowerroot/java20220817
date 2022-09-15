package ch15.lecture.p02set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C03Set {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		s1.add("1");
		s1.add("1");// 중복값은 추가 안됨
		s1.remove("1");
		System.out.println(s1);
		
		Set<String> s2 = Set.of("1","2"); //수정불가   //버전 9?부터 사용가능
	//	s2.add("1");
		
		int[] nums= {1,1,3};
	
		Set<Integer> s = new HashSet<Integer>();
        for(int i =0; i<nums.length;i++){
            
            if(s.add(nums[i])){
       
            }else{
                System.out.println(nums[i]); 
            }
        }
        
        // 1을 set으로 만들고
        //int[]i1=
        
        public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        	Set<Integer> ss = new HashSet<Integer>();
        	Set<Integer> rr = new HashSet<Integer>();
        	for(int i =0; i<nums1.length;i++){
        		ss.add(nums1[i]);
        	}
        	boolean b =true;
        	for(int i =0; i<nums2.length;i++){
        		if(!ss.add(nums2[i])  ) {
        			rr.add(nums2[i]);
        		}
        	}
        	for(int i =0; i<nums3.length;i++){
        		if(!ss.add(nums3[i]) && nums3[i-1]!=nums3[i]) {
        			rr.add(nums3[i]);
        		}
        	}
            	
        
        }
            
        
	
	
	}}
	
	
	
//287 2032 771 1684 2215  > set으로 풀기.
