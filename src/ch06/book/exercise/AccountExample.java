package ch06.book.exercise;

public class AccountExample {
	public static void main(String[] args) {
		Account a = new Account();
		
		a.setBalance(10000);
		System.out.println("current balance : "+ a.getBalance());
		
		a.setBalance(-1);
		System.out.println("current balance : "+ a.getBalance());
		
		a.setBalance(1000000000);
		System.out.println("current balance : "+ a.getBalance());
		
		a.setBalance(310000);
		System.out.println("current balance : "+ a.getBalance());
	}
	
	
	
	
}
