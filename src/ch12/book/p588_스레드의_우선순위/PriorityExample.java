package ch12.book.p588_스레드의_우선순위;

public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread t = new CalcThread("t" + i);
			if (i != 10) {
				t.setPriority(Thread.MIN_PRIORITY);
			}else {
				t.setPriority(Thread.MAX_PRIORITY);
			}
			t.start();
		}
	}
}

class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 2000000000; i++) {

		}
		System.out.println(getName());
	}
}
