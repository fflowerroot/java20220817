package ch07.book.p319_320_하나의_배열로_객체_관리;

import ch07.book.p314_317_필드의다형성.HankookTire;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		//따로생성해서 이름 붙였던 car의 tire객체들을 배열(index가 이름인)로 생성하니까 
		//  반복작업을 하기 수월하다!  index를 활용해서 반복문을 돌릴 수 있기 때문에!
		for(int i = 1; i <= 5 ; i++) {
			int problemLocation = car.run();
			if(problemLocation != 0 ) {
				System.out.println(car.tires[problemLocation-1].location + "HankookTire로 교체");
				car.tires[problemLocation-1] = 
						new HankookTire(car.tires[problemLocation-1].location, 15);
			}
			System.out.println("----------------------------------");
		}
				
	}
}
