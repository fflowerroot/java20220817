package ch11.lecture.p03string;

public class C04IndexOf {
	public static void main(String[] args) {
		String s1 = "abcdef";
		
		
		System.out.println(s1.indexOf("f"));
		
		String s2 = "hashcode is code value for instance ---- 01234.";
		System.out.println(s2.indexOf("code"));
		System.out.println(s2.indexOf(0));
		System.out.println(s2.indexOf("0"));
		System.out.println(s2.indexOf(111));
		System.out.println(s2.indexOf("o"));
		
	}
}
