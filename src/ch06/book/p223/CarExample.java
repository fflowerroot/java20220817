package ch06.book.p223;

public class CarExample{
	public static void main(String[] args) {
		Car c =  new Car();
		
		c.setGas(5);
		
		c.needToInject();
		
		
		if(c.isLeftGas()) {
			System.out.println("Drive");
			c.run();
		}
	
		c.needToInject();
	}	
}
