package ch06.lecture.p04static;

public class Myclass2 {

	static String company = "topgun";  //static field initialization
	static int rank;

	static {   //static field initialization
		int a = 39;
		int b = 33;
		rank = a * b;
	}

	String name;

}
