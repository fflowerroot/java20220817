package ch07.book.p314_317_필드의다형성;

public class KumhoTire extends Tire{
	//constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("Kumhotire life    :  " + (maxRotation - accumulatedRotation) + "times");
			return true;
		}
		System.out.println( "Kumhotire puncture");
		return false;
	}
}
