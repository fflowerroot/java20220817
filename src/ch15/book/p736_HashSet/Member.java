package ch15.book.p736_HashSet;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
		this.age=age;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age==age); ///여기서  member.name이랑 name에서 name이 뭐지..?
		}else {														// >> member.name은 obj의 실제 인스턴스의 name이라는 iv고, 
			return false;											//     member는 앞에 아무것도 안붙었으니까! 클래스 내부의 변수지!
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
//		return super.hashCode();
		return name.hashCode()+age;
			
	}
}//287
