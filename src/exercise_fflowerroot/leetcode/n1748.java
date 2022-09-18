package exercise_fflowerroot.leetcode;

import java.util.*;

public class n1748 {
	public static void main(String[] args) {
		System.out.println(sumOfUnique(new int[] { 1, 2, 2 }));
	}

	public static int sumOfUnique(int[] nums) {
		Set<Integer> s = new HashSet<>();
		Set<Integer> s2 = new HashSet<>();
		List<Integer> l = new ArrayList<>();
		int sum = 0;
		for (int num : nums) {
			if (!s.add(num)) {
				l.add(num);
			}
		}
//       for(int i:l) {
//       s.remove(new Integer(l.get(i)));//왜 객체까지 생성해서 넣었는데 계속 인덱스로 인식됨?
//       }
//        
		for (int i : s) {
			if (!l.contains(i)) {
				s2.add(i);
			}
		}

		for (Integer i : s2) {
			sum += i;
		}
		return sum;
	}
}
