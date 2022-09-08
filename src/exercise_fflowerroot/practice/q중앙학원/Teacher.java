package exercise_fflowerroot.practice.q중앙학원;

public class Teacher extends ChoongangAcademy implements Human {

//	static String[]s = {"a","b","c","d","e"};
	
	public Teacher(int hp) {
		this.hp = hp;
	}

	public static String answer(String q) {
		switch (q) {
		case "a":
		case "c":
		case "d":
			return "GOOD";
		case "b":
		case "e":
			return "BAD";

		}
		System.out.println("다시 입력하세요.");
		return q;

	}

	@Override
	public void 각오() {
		// TODO Auto-generated method stub
		System.out.println("교사 각오 아!!");
	}
}
