package ch12.lecture;

import java.awt.Toolkit;

public class C02Thread {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
	}
}
class Task2 implements Runnable{
	@Override
	public void run() {
		Toolkit t = java.awt.Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			t.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}
class Task1 implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("dd..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1초
		}
	}
}
