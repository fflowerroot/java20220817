package ch07.book.p314_317_필드의다형성;

public class Tire {
	// field
	public int maxRotation;
	public int accumulatedRotation;
	public String location;

	// constructor
	public Tire(String location, int maxRotation) {
		 this.location = location;
		this.maxRotation = maxRotation;
	}

	// method
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println("tire life	  :  " + (maxRotation - accumulatedRotation) + "times");
			return true;
		}
		return false;
	}
}
