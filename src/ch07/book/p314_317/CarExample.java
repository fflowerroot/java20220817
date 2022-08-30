package ch07.book.p314_317;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i = 1; i<=5; i++) {
			int problemLocation = car.run();					
			switch(problemLocation) {
			case 1:
				System.out.println("fL	  Replace with Hankook Tire");
				car.fL = new HankookTire("fL",15);
				break;
			case 2:
				System.out.println("fR	  Replace with Hankook Tire");
				car.fR = new KumhoTire("fR",15);
				break;
			case 3:
				System.out.println("bL	  Replace with Hankook Tire");
				car.bL = new HankookTire("bL",15);
				break;	
			case 4:
				System.out.println("bR	  Replace with Hankook Tire");
				car.fL = new KumhoTire("bR",15);
				break;
			}
			System.out.println("-------------------------------------------------");
		}		
	}
}
