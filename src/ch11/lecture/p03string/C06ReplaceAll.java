package ch11.lecture.p03string;

public class C06ReplaceAll {
	public static void main(String[] args) {
		String s1="hashcode is a code of instance.";
		System.out.println(s1.replace("code",  "CODE"));	
		System.out.println(s1.replaceAll("code", "CODE"));
		System.out.println(s1.replaceAll("{3}e", "CODE"));
		System.out.println(s1.replaceAll(".{3}e", "CODE"));
		//".{3}e"  >> regular expression (regex) 정규 표현식

	
	}
}
