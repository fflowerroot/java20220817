package ch07.book.p294_295;

public class Student extends People {
	public int studentNo;
	


	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
//		People(name, ssn);
		this.studentNo = studentNo;
	}
}
