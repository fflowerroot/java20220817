package ch08.book.p372_373_매개변수의_다형성;

public class Driver {
	// driver의  drive 기능을 통해서 Vehicle인 bus나 taxi를 run기능을 사용한다.

	public void drive(Vehicle vehicle) {
		// TODO Auto-generated method stub
		vehicle.run();
	}

}
