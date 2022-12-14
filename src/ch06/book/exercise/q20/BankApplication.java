package ch06.book.exercise.q20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		for (int i = 0; i < accountArray.length; i++) {
			accountArray[i] = new Account("ano", "owner", 0);
		}

		boolean run = true;
		while (run) {
			
			System.out.println("1.계좌생성  2.계좌목록  3.예금  4.출금  5.종료");
			
			System.out.print("선택 > ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("계좌생성");

		System.out.print("계좌번호 > ");
		String ano = scanner.next();

		System.out.print("계좌주 > ");
		String owner = scanner.next();
		System.out.print("초기입금액");
		int balance = scanner.nextInt();

		int count =0;
		accountArray[count] = new Account(ano, owner, balance);
		
		System.out.println("계좌가 생성되었습니다.");
		System.out.println("생성된 계좌번호 : " + accountArray[count].getAno());
		count++;
	}

	private static void accountList() {
		for (int i = 0; i < accountArray.length; i++) {
			System.out.println("계좌번호(" + i + ")" + accountArray[i].getAno()
							   + "잔고 : " + accountArray[i].getBalance());
		}

	}

	private static void deposit() {
		System.out.print("계좌번호 > ");
		String input = scanner.next();
		String ano = "0";
		
			for (int i = 0; i < accountArray.length; i++) {				
				if (accountArray[i].getAno().equals(input) ) {
					System.out.print("예금액 > ");
					int input2 = scanner.nextInt();
					accountArray[i].setBalance(input2);
					break;
				}
			}

		}

	

	private static void withdraw() {
		// TODO Auto-generated method stub

	}

}
