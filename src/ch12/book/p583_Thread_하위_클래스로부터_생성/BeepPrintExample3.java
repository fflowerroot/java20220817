package ch12.book.p583_Thread_하위_클래스로부터_생성;

import java.awt.Toolkit;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread t = new BeepThread();
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("dd..");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit t = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			t.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
