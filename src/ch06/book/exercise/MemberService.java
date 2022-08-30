package ch06.book.exercise;

public class MemberService {
	
	
	boolean login(String id, String password){
		return id.equals("Seo") && password.equals("12345");
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
