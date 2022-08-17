package ch06.book;

public class P210Car {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	P210Car(){
		
	}
	P210Car(String model){
		model = model;   //this를 사용하는 이유가 같은 이름으로 매개변수를 쓰기 위해서 
	}
	
	P210Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	P210Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
		
	
	

}
