package exercise_fflowerroot.practice.q중앙학원;

public class Student extends ChoongangAcademy implements Human{
	int number;
	
	Student(int number,int hp){
		this.number = number;
		super.hp = hp;
	}
	
	void question(String q) {
		String ans = Teacher.answer(q);
		if(ans.equals("GOOD") ) {
			System.out.println("감사합니다!");
		}if(ans == "BAD") { //"BAD" 문자열의 객체를 만들지 않아서 아마도 == 을 쓸 수 있었나보지?
			hp-=10;
			System.out.println("감사합니다..");
		}
	}
	
	@Override
	public void 각오() {
		// TODO Auto-generated method stub
		System.out.println("학생 "+number+" 각오 아아아!!!");
	}
	
}
