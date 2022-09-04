package exercise_fflowerroot.js.p348_접근_제어자;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); 
		//The constructor Singleton() is not visible

		Singleton s = Singleton.getInstance();
		Singleton ss = Singleton.getInstance();
		System.out.println(s);
		System.out.println(ss);
	}
}

class Singleton {
	private static Singleton s;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (s == null) {
			return s = new Singleton();
		}
		return s;

	}
}
