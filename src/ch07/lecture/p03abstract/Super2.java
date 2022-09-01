package ch07.lecture.p03abstract;

public abstract class Super2 {
	
	public abstract void cry() {
	} // - Abstract methods do not specify a body
	  //- The abstract method cry in type Super2 can only be defined by an  abstract class
	
	
	
	public void walk() {
		System.out.println("네 발로 걷습니다.");
	}
	public void eat() {
		System.out.println("밥을 먹습니다.");
	}
}
