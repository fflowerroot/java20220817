package ch12.book.p591_공유_객체를_사용할_때의_주의점;

// 공유객체를 사용의 문제점을 해결한다는 것은 매우어려운 일이므로 초보자의 경우 사용을 자제하도록 하자.

public class MainThreadExample {
	public static void main(String[] args) {
		Calc c = new Calc();
		User1 u1 = new User1();
		u1.setCalc(c);
		u1.start();

		User2 u2 = new User2();
		u2.setCalc(c);
		u2.start();

	}
}

class Calc {
	private int memory;

	int getMemory() {
		return memory;
	}

	void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}

}

class User1 extends Thread {
	private Calc c;

	public void setCalc(Calc c) {
		this.setName("User1");
		this.c = c;
	}

	public void run() {
		c.setMemory(100);
	}
}

class User2 extends Thread {
	private Calc c;

	public void setCalc(Calc c) {
		this.setName("User2");
		this.c = c;
	}

	public void run() {
		c.setMemory(50);
	}
}
