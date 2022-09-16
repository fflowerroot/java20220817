package exercise_fflowerroot.leetcode;

import java.util.HashSet;
import java.util.Set;

public class n1684_2 {
	public static void main(String[] args) {
		System.out.println(	countConsistentStrings("fstqyienx", new String[]{"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"}));
		System.out.println(	countConsistentStrings("abc", new String[]{"n","eeitfns","eqqqsfs"}));
	}
//	"fstqyienx"가 뭐야?
//	["n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"]

	static public int countConsistentStrings(String allowed, String[] words) {
// 		int count = 0;
// 		for (int a = 0; a < words.length; a++) {
// 			int count2 = 0;
// 			for (int i = 0; i < words[a].length(); i++) {

// 				for (int j = 0; j < allowed.length(); j++) {
// 					if (words[a].charAt(i) == allowed.charAt(j)) {
// 						count2++;
// 					} else {
// 					}
// 				}
// 				if (count2 == words[a].length()) {
// 					count++;
// 				}
// 			}
// 		}
// 		return count;

		// for (int a = 0; a < words.length; a++) {
		// if(words[a].matchs("")
		// }
		// return

		int cnt2 = words.length;
		for (int i = 0; i < words.length; i++) {
			Set<Character> s = new HashSet<>();
			Set<Character> s2 = new HashSet<>();
			
			for (int j = 0; j < words[i].length(); j++) {
				s.add(words[i].charAt(j));
			} System.out.println(s);//-----------------
			for (int j = 0; j < allowed.length(); j++) {
				s2.add(allowed.charAt(j));
			} //System.out.println(s);//-----------------
			for (int j = 0; words[i].length() > j; j++) {
				if (!s2.contains(words[i].charAt(j))) {
			//	if (!s2.contains(allowed.charAt(j))) {
					cnt2--;  
					break;
				}
			}
		}
		return cnt2;
	}
}
