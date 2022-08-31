package ch07.book.exercise.q6;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("hong");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
}
