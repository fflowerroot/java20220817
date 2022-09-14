package ch12.lecture;

public class C07SynchronizedBlock {
	public static void main(String[] args) throws InterruptedException {
		int[] a = { 0 };
		Thread t = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {

				synchronized (a) {
					a[0]++;
				}
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				synchronized (a) {
					a[0]++;
				}
			}
		});
		t.start();
		t2.start();
		
		t.join(); // 이거 뭐지?
		t2.join();

		System.out.println(a[0]);
	}
}
