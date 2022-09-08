package ch05.book.p171_열거타입;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;break;
		case 2:
			today = Week.MONDAY;break;	
		case 3:
			today = Week.THURSDAY;break;
		case 4:
			today = Week.WEDNSDAY;break;
		case 5:
			today = Week.THURSDAY;break;
		case 6:
			today = Week.FRIDAY;break;
		case 7:
			today = Week.SATURDAY;break;	
		}
		System.out.println("Today is "+today);
		
		if (today==Week.SUNDAY) {
			System.out.println("일에일에는 축구를 합니다.");
		}else {
			System.out.println("Study java.");
		}
				
	}
}
