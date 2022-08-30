package ch06.lecture.p09getset;

public class MyClass2 {
// field는 특별한 이유가 없으면 private으로 두래
// Source 메뉴에 자동생성기능 있음(한번에 선택해서 생성가능)	
// ctrl + 1 눌러도 getter,setter메서드 자동생성 가능

	private String name;  
	private int age;
	private boolean alive;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAlive() { // boolean 타입은 get 대신에 is로 쓴다. 자동생성도 is로 됨.
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
