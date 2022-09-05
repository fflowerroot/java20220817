package ch10.book.exercise.q7;

public class WrongPasswordException extends Exception {
	public WrongPasswordException() {
	}
	public WrongPasswordException(String message) {
		super(message);
	}
}
