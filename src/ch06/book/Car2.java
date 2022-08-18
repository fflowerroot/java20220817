package ch06.book;

public class Car2 {

	String model;
	int speed;
	
	Car2(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i <= 50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + " is runnig.(" + this.speed + "km/h)");
		}
	}
	
	
}

