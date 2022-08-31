package ch07.book.p322_323_매개변수의_다형성;

//  field의 다형성..
//  parameter 의 다형성..

//	다형성? 부모의 참조변수에 자식/자손의 인스턴스를 저장하는 것이 전부?
//  오버라이드 할 수 있고, 사용되는건 실제 인스턴스의 메서드.

// parameter 타입이 여러개인경우를 생각해봐.
//  	>  상속/다형성이 없다면 overloading으로 해결 
// 메서드호출을 할때는, 특별히 달라지는 코드가 없는듯. 왜냐하면 사용할 인스턴스를 모두 생성해야함.
// 다형성은 아래처러럼 overloading 으로 여러번 정의한 메서드들의 파라미터가 
//		같은부류의 것들(조상에 속하는 것들)이라면 조상타입하나의 parameter로 모두 처리할 수 있음.

public class Driver {
	public void drive(Vehicle o) {
		System.out.println( o +" is runnig...");		
	}
	public void drive(Bus b) {
		System.out.println( b +" is runnig...");		
	}
	public void drive(Taxi t) {
		System.out.println( t +" is runnig...");		
	}
	
	public void drive2(Vehicle o) {
		o.run();
	}
	public void drive3() {
		Vehicle v = new Vehicle();
		v.run();
	}
}














