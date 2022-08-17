package ch02.book;

public class _02GarbageValueExample {

	public static void main(String[] args) {
		byte byte_ = 125;
		int int_ = 125;
		
		System.out.println("byte_" + "\t" + "int_");
		
		for(int i = 0; i < 5; i++) {
			byte_++;
			int_++;
			
			System.out.println(byte_ + "\t" + int_);
		}

	}

}
