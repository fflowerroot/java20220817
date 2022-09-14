package ch12.book.p579Thread클래스로부터_직접_생성;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable bt =new BeepTask();
		Thread t = new Thread(bt);
		t.start(); // Thread의  start()에  run()이 없는데.. 왜 run()이 실행이 되지??
					// >> Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread.
					//   >> ??  run()을 작성해놓으면 됐지 왜 jvm이 호출하게 했지??
					//     >> Thread.start()와 Thread.run()의 차이를 알아야하나..봐?
		
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
class BeepTask implements Runnable {
	@Override
	public void run() {     //If this thread was constructed using a separate Runnable run object, then that Runnable object's run method is called; otherwise, this method does nothing and returns.
		Toolkit t = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			t.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
// 인터페이스는 객체를 만들지 못함

