package ch08.book.p376_객체_타입_확인_instanceof;

import ch08.book.p372_373_매개변수의_다형성.Taxi;
import ch08.book.p372_373_매개변수의_다형성.Vehicle;
import ch08.book.p374_375_강제_타입_변환_Casting.Bus;

public class Driver {
	
	// 인터페이스 메서드를 오버라이딩 하지 않은 메서드를 사용하기 위해, 다시 형변환을 해서 사용
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
	        // 이렇게 참조변수 생성 없이 써도 됨 > ((Bus) vehicle).checkFare();
		}
	}
	
	//? 다형성을 이용해서 static멤버(클래스 멤버)를 사용할 수 있나?
	// 없는 것 같은데.. 왜냐하면 다형성은 참조변수를 이용한거니까.....
	
	public void drive2(Vehicle vehicle) {
		((Bus) vehicle).checkFare();
		
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
//		Vehicle vehicle = new Vehicle();//Cannot instantiate the type Vehicle
		
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
		
		driver.drive2(bus);
	//	driver.drive2(taxi);
		
	//	bus.run2();
	//	bus.run3(); //실행오류>>The type Bus must implement the inherited abstract method Vehicle.run3()
	}
}


