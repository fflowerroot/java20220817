package ch11.book.p461_객체_해시코드_hashCode;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Key) {
			Key compareKey = (Key)obj;
			if(this.number==compareKey.number) {
				return true;
			}
		}
		return false;
	}
}
