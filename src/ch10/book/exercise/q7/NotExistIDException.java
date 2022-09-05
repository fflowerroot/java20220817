package ch10.book.exercise.q7;

public class NotExistIDException extends Exception{
	public NotExistIDException() {
	}
	public NotExistIDException(String message) {
		super(message);
	}
}
