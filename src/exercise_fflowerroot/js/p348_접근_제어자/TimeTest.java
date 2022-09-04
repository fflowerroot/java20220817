package exercise_fflowerroot.js.p348_접근_제어자;

public class TimeTest {
	public static void main(String[] args) {
		Time time=new Time(5, 15, 33);
		System.out.println(time.toString());
	}
}

class Time {
	private int hour, minute, second;

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (0 <= hour && hour <= 23)
			this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (0 <= minute && minute <= 59)
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (0 <= second && second <= 59)
		this.second = second;
	}
	
	public String toString() {
		return hour+":"+minute+":"+second;
	}

}










