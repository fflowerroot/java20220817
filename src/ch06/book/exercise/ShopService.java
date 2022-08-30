package ch06.book.exercise;

public class ShopService {
	static ShopService s =new ShopService();
	
	private ShopService() {
	}
	
	public static ShopService getInstance() {
//		return s; //Cannot make a static reference to the non-static field s 
		return s;
	}
}
