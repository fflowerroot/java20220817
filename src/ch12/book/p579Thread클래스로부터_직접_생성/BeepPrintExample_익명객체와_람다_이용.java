package ch12.book.p579Thread클래스로부터_직접_생성;

import java.awt.Toolkit;

public class BeepPrintExample_익명객체와_람다_이용 {
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit t = Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					t.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
	}
}
