package ch05.book.p171_열거타입;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name(); //?
		System.out.println(name);
		System.out.println(today);
		
		//ordinal()
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		//compareTo()
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNSDAY;
		int r1 =day1.compareTo(day2);
		int r2=day2.compareTo(day1);
		System.out.println(r1+", "+r2);
		//valueOf()
		if(args.length==1) {
			String strDay=args[0];
			Week weekDay=Week.valueOf(strDay);
			
		}
	}
}
