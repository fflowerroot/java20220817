package ch06.book.exercise;

public class printerExample {
	public static void main(String[] args) {
	
		Printer.println(10);
	//	printer.println(false);
		
		Printer printer = new Printer();
		
		printer.println(false);
		printer.println(4.0);
		printer.println("aaa");
	}
}
