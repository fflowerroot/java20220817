package ch12.lecture;

import java.awt.Toolkit;
import java.util.Iterator;

public class C01Thread {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i <5; i++) {
			System.out.println("dd..");
			Thread.sleep(1000); //1초
		}
		Toolkit t = java.awt.Toolkit.getDefaultToolkit();
		for(int i =0; i<5; i++) {
			t.beep();
			Thread.sleep(1000);
		}
	}
}
