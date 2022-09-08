package exercise_fflowerroot.leetcode;

import java.util.Arrays;

class N1684 {
	static public int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		for (int a = 0; a < words.length; a++) {
			int count2 = 0;
			for (int i = 0; i < words[a].length(); i++) {

				for (int j = 0; j < allowed.length(); j++) {
					if (words[a].charAt(i) == allowed.charAt(j)) {
						count2++;
					} else {
					}
				}
				if (count2 == words[a].length()) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] words = { "aa", "bdd", "d","abcd","bd" };
		String allowed = "bd";

		System.out.println(countConsistentStrings(allowed, words));
	}
}
