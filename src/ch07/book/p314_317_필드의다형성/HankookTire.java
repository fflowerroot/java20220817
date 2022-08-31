package ch07.book.p314_317_필드의다형성;

public class HankookTire extends Tire {
	// constructor
	public HankookTire(String location,int maxRotation) {
		super(location, maxRotation);
	}

	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("Hankooktire life  :  " + (maxRotation - accumulatedRotation) + "times");
			return true;
		}
		System.out.println( "Hankooktire puncture");
		return false;
	}

}
