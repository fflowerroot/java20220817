package ch07.book.exercise.q7;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;

		snowTire.run();
		tire.run();

		tire = new Tire();
		tire.run();
	}
}
