package ch11.lecture.p04regex;

public class C01Regex {
	public static void main(String[] args) {
		// regular expression (regex)
		// 정규표현식/정규식표현
		// 문자열의 패턴을 표현하는 코드(문자열)
		// "b+" b가 한 개 이상
		// "b*" b가 0개 이상
		
		String s1 = "a";
		String pattern1 = "a";  // 하나의 문자
		System.out.println(s1.matches(pattern1));
		
		String s2="bb";
		String p2="b";
		System.out.println(s2.matches(p2));
		
		String s3 = "bbb";
		String p3 = "b+";
		
		System.out.println(s3.matches(p3));
		System.out.println(s2.matches(p3));
		System.out.println("b".matches("b+"));
		
		String p4 = "dog";
		String p5 = "do+g";
		System.out.println("a".matches("[abcd]"));//[]안에 나열된 문자 중 하나
		System.out.println("ab".matches("[abcd]"));
		
		System.out.println("a".matches("[a-c]"));
		System.out.println("A".matches("[a-cA-C]"));
		
		
		String ss="[^abc]";
		System.out.println("ee".matches(ss));
		
		
//		System.out.println(0.matches("."));
		System.out.println("  ".matches(".{2}"));
		System.out.println(" ".matches(".{2}"));
		System.out.println("".matches(".{2}"));
		
//		System.out.println("1".matches("\d"));
		System.out.println("1".matches("\\d"));
		
		String s11="\\d{6}-?\\d{7}";
		System.out.println("5755574665456".matches(s11));
		System.out.println("575557-4665456".matches(s11));
//		
		String s12="(\\d{4}|\\d{2})\\d{4}";
		System.out.println("901117".matches(s12));
		System.out.println("19901117".matches(s12));
		System.out.println("--");
//		
		String q="QQaQaaa";
		System.out.println(q.matches("[^a]*a[^a]*a[^a]*a[^a]*"));
		
		
		String p23 = "(\\d{4}|\\d{2})-?\\d{2}-?\\d{2}";
		System.out.println("19550101".matches(p23));
		System.out.println("550101".matches(p23));
		System.out.println("9550101".matches(p23));
		System.out.println("1955-01-01".matches(p23));
		System.out.println("55-01-01".matches(p23));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
