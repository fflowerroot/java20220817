package ch07.book.p322_323_매개변수의_다형성;

public class DriverExample {
	public static void main(String[] args) {
		Driver dr = new Driver();
		
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		 
		
		dr.drive(b);  //Bus@2401f4c3 is runnig...
		dr.drive(t);  //Taxi@3830f1c0 is runnig...
		
		
		//--field의 다형성?--
		Vehicle v = b; 
		dr.drive(v);  //Bus@2401f4c3 is runnig...  
		
		
//		dr.drive2(t);
//		dr.drive2(b);
//		
//		dr.drive3();
		
//		Vehicle v2 = new Vehicle();
//		v.run(b);
//		v.run(t);
//		v.run(v2);
	}
}























