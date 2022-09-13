package ch13.book.p659_멀티_타입_파라미터;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<Tv, String>();
		//p1.setKind(new Tv());
		//p1.setModel("smart TV");
		Tv tv = p1.getKind();
		String tvModel = p1.getModel();
		
		Product<Car,String> p2 = new Product<Car,String>();
		p2.setKind(new Car());
		
	}
}

class Product<T,M>{
	private T kind;
	private M model;
	
	public T getKind() { return this.kind;}
	public M getModel() { return this.model;}
	
	public void setKind(T kind) { this.kind=kind;}
	public void setModel(M model) {this.model=model;}
	
}

class Tv{
	
}
class Car{
	
}
