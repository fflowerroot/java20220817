package exercise_fflowerroot._220823.conversion;

public class ToYard {
	public static void main(String[] args) {
		double meter= 100.785;
		double yard=toYard(meter);
		System.out.println(yard);
		
	}
	static double toYard(double meter){
		return meter*1.0936;
	}
}
