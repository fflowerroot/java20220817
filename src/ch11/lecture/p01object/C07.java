package ch11.lecture.p01object;

public class C07 {
	public static void main(String[] args) {
		Object a = new Computer("ka",111);
		System.out.println(a.toString());
	}
}
class Computer{
	private String model;
	private int ssd;
	
	public Computer(String model, int ssd) {
		this.model=model;
		this.ssd=ssd;
	}

	@Override
	public String toString() {
		return "Computer [model=" + model + ", ssd=" + ssd + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "model : "+model +"    ssd: "+ssd; 
//
//	}
}
