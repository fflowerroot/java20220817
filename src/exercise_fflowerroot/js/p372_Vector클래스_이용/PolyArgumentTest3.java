package exercise_fflowerroot.js.p372_Vector클래스_이용;

import java.util.Vector;

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Product t = new Tv();
		Product c = new Computer();
		
		b.buy(c);
		b.buy(t);
		b.summary();
		
	}
	
}
class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		// TODO Auto-generated constructor stub
		this.price=price;
		bonusPoint = price/10;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}	
}
class Tv extends Product{
	public Tv() {
	super(100);	// TODO Auto-generated constructor stub
	}
	public String toString() { return "Tv";}
}
class Computer extends Product{
	public Computer() {
	super(20);	// TODO Auto-generated constructor stub
	}
	public String toString() { return "Computer";}
}
class Audio extends Product{
	public Audio() {
	super(50);	// TODO Auto-generated constructor stub
	}
	public String toString() { return "Audio";}
}
class Buyer{
	int money =1000;
	int bonusPoint=0;
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			money-=p.price;
			bonusPoint+=p.bonusPoint;
			item.add(p);
			System.out.println(p+" 구입");
		}	
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+" 반품");
		}else {
			System.out.println("구입한 제품 중 해당 제품이 없음");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("구입한 제품이 없음");
		}else {
			for(int i = 0; i<item.size();i++) {
				Product p = (Product)item.get(i);
				sum+=p.price;
				itemList+=(i==0)? ""+p:" ,"+p;		
			}
			System.out.println("구입하신 물품의 총액은 "+sum+"입니다.");
			System.out.println("구입하신 물품은 "+itemList+"입니다.");
		}
	}
}










































