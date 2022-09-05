package ch10.book.p445_예외_정보_얻기;

import ch10.book.p443_사용자_정의_예외와_예외_발생.Account;
import ch10.book.p443_사용자_정의_예외와_예외_발생.BalanceInsufficientException;

public class AccountExample {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.deposit(10000);
		System.out.println("예금액 " +  ac.getBalance());
		
		try {
			ac.withdarw(30000);
			
		}catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		
		}
	
	}
}
