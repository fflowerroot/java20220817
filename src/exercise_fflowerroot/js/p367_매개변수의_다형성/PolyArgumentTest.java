package exercise_fflowerroot.js.p367_매개변수의_다형성;

// 바이어- 돈, 포인트
// 프로덕트- 포인트점수, 금액
// 실행- 바이어의 바이기능으로 프로덕트들을 구매하고 포인트적립
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer buyer = new Buyer(10000000);
		Tv tv = new Tv(500000);
		buyer.buy(tv);
		System.out.println(buyer.money);
		System.out.println(buyer.accumulatedPoint);
		

	}
}
// 초기화 순서가.. 필드 > 생성자 순서야??
class Product {

	public int price;
//	public int point = price / 10;
	public int point;
	public Product(int price) {
		this.price = price;
		this.point = price/10;
	}
	
}

class Tv extends Product {
	public Tv(int price) {
		super(price);
	}
}

class Computer extends Product {
	Computer(int price) {
		super(price);
	}
}

class Buyer {
	int money;
	int accumulatedPoint;

	public Buyer(int money) {
		this.money = money;
	}

	public void buy(Product product) {
		money -= product.price;
		accumulatedPoint += product.point;
		System.out.println(" price : " + product.price + "    point : " + product.point);
	}
}
