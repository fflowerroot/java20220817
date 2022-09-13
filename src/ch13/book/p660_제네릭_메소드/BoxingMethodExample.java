package ch13.book.p660_제네릭_메소드;

import ch13.book.p655_제네릭_타입.Box;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.<Integer>boxing(100);
		int iv = box1.get();
		Box<Integer> box2 = Util.boxing("hong..");
		String sv = box2.get();
	}
}
class Util{
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}

	public static boolean compare(Pair<Integer, String> p1, Pair<Integer, String> p2) {
		// TODO Auto-generated method stub
		return false;
	}
}

