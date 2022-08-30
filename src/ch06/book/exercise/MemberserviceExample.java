package ch06.book.exercise;

public class MemberserviceExample {
	public static void main(String[] args) {

	MemberService ms =new MemberService();
	boolean r = ms.login("Seo","12345");
	if(r) {
		System.out.println("로그인 되었습니다.");
		ms.logout("Seo");
		
	}else {
		System.out.println("id또는 password가 올바르지 않습니다.");
	}
	
    }
}
