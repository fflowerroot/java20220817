package exercise_fflowerroot._20220829;

public class CatingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe =null;
		
		car.drive();
	//	fe = car;
		fe = (FireEngine)car;
		//Exception in thread "main" java.lang.ClassCastException: 
		//class exercise_fflowerroot._20220829.Car cannot be cast to class exercise_fflowerroot._20220829.FireEngine 
		//(exercise_fflowerroot._20220829.Car and exercise_fflowerroot._20220829.FireEngine are in unnamed module of loader 'app')
		//at exercise_fflowerroot._20220829.CatingTest2.main(CatingTest2.java:11)
		fe.drive();
		car2 = fe;
		
	} 
	
}
