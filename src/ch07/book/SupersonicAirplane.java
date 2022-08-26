package ch07.book;

public class SupersonicAirplane extends Airplane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("Fly at supersonic speed.");
		}else {
			super.fly();
//			fly(); // Exception in thread "main" java.lang.StackOverflowError
		}
	}
	
}
