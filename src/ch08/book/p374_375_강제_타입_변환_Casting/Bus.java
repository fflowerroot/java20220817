package ch08.book.p374_375_강제_타입_변환_Casting;
import ch08.book.p372_373_매개변수의_다형성.Vehicle;
public class Bus implements Vehicle{
	
	 public static void staticM(){
		 System.out.println("Bus staticM...");
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void checkFare() {
		System.out.println("Check fare..");
	}
	
	

}
