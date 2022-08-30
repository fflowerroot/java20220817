package ch06.book.exercise;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService o1 = ShopService.getInstance();
		ShopService o2 = ShopService.getInstance();
		System.out.println(o1==o2);
	}
}
