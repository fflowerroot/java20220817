package ch06.book;

public class Car {
	String company = "현대";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자는 ..
	
	Car(){		
	}
	
	Car(String a, String b, int c){
		model = a;
		color = b;
		maxSpeed = c;
	}
	
//	Car(String model){
//		this(a,"은색",250); //a cannot be resolved to a variable
//	}
	
	Car(String a){
		this(model,"은색",250); 
	} /*Cannot refer to an instance field model while explicitly invoking a constructor
	   일반 메서드에서 중첩함수의 매개변수는 원래함수 매개변수랑 같아야지.... 
	   아니면 뭐 입력받을 방법이 없잖아..*/
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	
	
//	Car(String model, String color, int maxSpeed){
//		this.model = model;
//		this.color = color;
//		this.maxSpeed = maxSpeed;
	

	static int subtract(int a, int b) {
		return a - b;
	}
	
	
	
	static int  addd(int a, int b) {
		
		return  subtract(a,b);
	}
	
	
	public static void main(String[] args) {
		 System.out.println(addd(1, 2));
		
	}
	
	System.out.println(addd(1, 2));  
	// 시스템프린트함수는 메인메서드에서만 호출할 수 있어?? 왜 안되지?
	
	
}







