package ch07.book.p314_317_필드의다형성;

public class CarExample {
	// 	Car를 run 1회 run시킨 후에
	//		>  int run() 를 Car class에 작성
	//  problemLocation(바퀴4개 중 어떤  Tire가 문제가 있는지)확인 후
	//  Tire를 'Tire의 자손 클래스 타입의 Tire'로 교체
	//		> car.fL = new HankookTire("fL",15);
	//  위 코드를 5회 반복	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemLocation = car.run();					
			switch(problemLocation) {
			case 1:
				System.out.println("fL	  Replace with Hankook Tire");
				car.fL = new HankookTire(15); 
				// 근데..  Car에서 Tire인스턴스 생성시 위치 지정해서 생성했는데,
				//    Tire에 위치를 지정해서 생성할 필요가 있나?
				//     >> 그래서  Tire생성자에서 location parameter지우고,  field에서도 location멤버 지움
				//       그런데 일일이 하나하나 지움.. 상속/다형성은 수정이 쉽다며..어떨 때 쉬운거지?
				break;
			case 2:
				System.out.println("fR	  Replace with Hankook Tire");
				car.fR = new KumhoTire(15);
				break;
			case 3:
				System.out.println("bL	  Replace with Hankook Tire");
				car.bL = new HankookTire(15);
				break;	
			case 4:
				System.out.println("bR	  Replace with Hankook Tire");
				car.fL = new KumhoTire(15);
				break;
			}
			System.out.println("-------------------------------------------------");
		}		
	}
}
