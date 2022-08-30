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
	//	for(  ; speed <= 100;  ) {
		while(speed <= 100) {
			System.out.println(this.model + " is runnig.(" + this.speed + "km/h)");
			setSpeed(speed+10);
		}
	}
	
	
}

