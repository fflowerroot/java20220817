package ch07.book.exercise.q5;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		//Implicit super constructor Parent() is undefined. Must explicitly invoke another constructor
		super(name);
		super.name=name;
		this.name =name;
		this.studentNo =studentNo;
	}
}
