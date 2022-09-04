package exercise_fflowerroot.js.p370_여러_종류의_객체를_배열로_다루기;

public class PolyArgumentTest2 {
	// 바이어/ 필드-돈,축적포인인트 기능-산다(-프로덕트금액,+프로덕트포인트)
	// 추상프로덕트/ 금액, 포인트
	// 프로덕트인스턴스들-tv,computer..
	public static void main(String[] args) {
		Buyer Seo = new Buyer(1000000);
		Product tv = new Tv(100);
		Product computer = new Computer(200);
		
		Seo.buy(computer);
		Seo.buy(tv);
		
		System.out.println(Seo.getMoney());
		System.out.println(Seo.getAccumulatedPoint());
		Seo.myProducts();
		
		
	}
}

class Buyer {
	private int money;
	private int accumulatedPoint;
	private Product[] myProducts = new Product[10];
	int i = 0;

	public Buyer(int money) {
		setMoney(money);
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getAccumulatedPoint() {
		return accumulatedPoint;
	}

	public Product[] getMyProduct() {
		return myProducts;
	}

	public void buy(Product product) {
		money -= product.getPrice();
		accumulatedPoint += product.getPoint();
		myProducts[i] = product;
		i++;
	}
	
	public void myProducts() {
		String produectList= "";
		for(int i =0;i<myProducts.length;i++) {
			produectList+=myProducts[i]+",";
		}
		System.out.println(produectList);
	}
}

abstract class Product {
	protected int price;
	protected int point;

	public Product(int price) {
		this.point = price / 10;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getPoint() {
		return point;
	}

}

class Tv extends Product {

	public Tv(int price) {
		super(price);
	}
	public String toString() { return "Tv"; } //System.out.println()메서드에 toString()메서드 호출이 있나보지???

}
class Computer extends Product{

	public Computer(int price) {
		super(price);
	}
	public String toString() { return "Computer"; }
}	
