package ch13.book.p660_제네릭_메소드;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer,String>p1=new Pair<>(1,"apple");
		Pair<Integer,String>p2=new Pair<>(1,"apple");
		boolean r1=Util.<Integer,String>compare(p1,p2);
	}
}
class Pair<K,V>{
	private K key;
	private V value;
	
	public Pair(K key, V value) {
		this.key= key;
		this.value=value;
	}
	public void setKey(K key) {this.key= key;}
	public void setValue(V value) {this.value= value;}
	public K getKey() { return key;}
	public V getValue() { return value;}
	
}
