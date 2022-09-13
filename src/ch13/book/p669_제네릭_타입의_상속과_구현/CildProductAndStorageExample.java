package ch13.book.p669_제네릭_타입의_상속과_구현;

public class CildProductAndStorageExample {

}

class Product<T,M>{
	private T kind;
	private M model;
	
	public T getKind() {return this.kind;}
	public M getModel() {return this.model;}
	
	public void setKind(T kind) {this.kind=kind;}
	public void setModel(M model) {this.model=model;}
	
}
class Tv{}
class ChildProduct<T,M,C> extends Product<T,M>{
	private C company;
	public C getCompany() {return this.company;}
	public void setCompany(C company) {this.company=company;}
}

interface Storage<T>{
	public void add(T item, int index);
	public T get(int index);
}

class StorageImpl<T> implements Storage<T>{
	private T[]array;
	public StorageImpl(int capacity) {
		// TODO Auto-generated constructor stub
	}
}
