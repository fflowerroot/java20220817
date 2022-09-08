package exercise_fflowerroot.practice.q중앙학원;

public class ChoongangExample {
	public static void main(String[] args) {
		Student student = new Student(1001, 70);
		Student student2 = new Student(1002, 30);
		Teacher teacher = new Teacher(100);
		
		for(int time = 9; time < 18 ; time++) {
			student.hp-=5;
			student2.hp-=5;
			
			if(time == 10) {
				student.question("c");
			}
			if(time==14) {
				student2.question("e");
			}
			if(time==12) {
				
				student.rest();
				student2.rest();
				teacher.rest();
				
			}
			if(time==15) {
				student.각오();
				student2.각오();
				teacher.각오();
			}
			
		}
		System.out.println(student.number+"학생 HP : "+ student.hp);
		System.out.println(student2.number+"학생 HP : "+ student2.hp);
		System.out.println("선생님 HP : " + teacher.hp);
	}
}
