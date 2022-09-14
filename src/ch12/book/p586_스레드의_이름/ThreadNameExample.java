package ch12.book.p586_스레드의_이름;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		ThreadA a = new ThreadA();
		System.out.println("작업 스레드 이름 : " + a.getName());
		a.start();
//		a.start(); // 이거 왜 안돼? 한 번 실행하면 같은 실행 안됨?
		ThreadB b = new ThreadB();
		System.out.println("작업 스레드 이름 : " + b.getName());
		b.start();
	//	a.start(); // 이거 왜 안돼?
		
	}
}
class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");}
	public void run() {
		for(int i = 0; i <2;i++ ) {
			System.out.println(getName()+"..");
		}
	}
}

class ThreadB extends Thread{
	public void run() {
		for(int i = 0; i <2;i++ ) {
			System.out.println(getName()+"..");
		}
	}
}

	