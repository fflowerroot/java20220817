package ch06.book;

public class P210CarExample {

	public static void main(String[] args) {
		P210Car car1 = new P210Car();
		System.out.println(car1.company);
		
		P210Car car2 = new P210Car("d"); 
		
		
	    P210Car car3 = new P210Car("d","e"); 
			
		
	    P210Car car4 = new P210Car("d","e", 100);
		
		System.out.println(car2.color);
		System.out.println(car3.model);
		System.out.println(car3.maxSpeed);
	}
	
	
    		
    
		
	
			
}
