package ch06.lecture.p09getset;

public class MyClass1 {
	private int age = 30;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {  // 특정조건이 만족할 때만 private멤버에 접근 가능하도록 함.
		if(age>=0) {
			this.age = age;
		}
	}
}
