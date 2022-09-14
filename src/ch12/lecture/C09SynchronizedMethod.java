package ch12.lecture;

public class C09SynchronizedMethod {
	public static void main(String[] args) {
		M m= new M();
		Thread t = new Thread(()->{
			
		});
	}
}
class M{
	private int i;
	
	public int getI() {
		return i;
	}
	public void increment(){
		i++;
	}
}
