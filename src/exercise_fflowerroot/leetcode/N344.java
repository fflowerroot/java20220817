package exercise_fflowerroot.leetcode;

class N344 {
	static public void reverseString(char[] s) {
		char t = 'a';
		for (int i = 0, j = s.length - 1; i < s.length / 2; i++, j--) {
			t = s[i];
			s[i] = s[j];
			s[j] = t;
			System.out.println(s);
		}
		System.out.println(s);
	}

	public static void main(String[] args) {
		// char[]s ={'h','e','l','l','o'};
		// char[]s ={'h','e','l','a','l','o'};
		char[] s = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		reverseString(s);
	}
}
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]