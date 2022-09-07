package ch11.book.p458_객체_비교_equals;

public class MemberExample {
	public static void main(String[] args) {
		Member o1 = new Member("blue");
		Member o2 = new Member("blue");
		Member o3 = new Member("red");
		
		if(o1.equals(o2)) {
			System.out.println("동등");
		}	
	
		String s = "ss";
		String ss = "ss";
		System.out.println(s.hashCode()==ss.hashCode());
	}
}
