package ch08.book.p372_373_매개변수의_다형성;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
	}
}
