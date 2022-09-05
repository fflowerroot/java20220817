package ch10.book.p443_사용자_정의_예외와_예외_발생;

// 예외를 직접 만드는 회사도 있고,   if-else문으로 해결하는 회사도 있다.
//		보통 if-else로 해결한대.
// 주의할 점은, 예외 메세지를 꼭 남길것.

public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}
}
