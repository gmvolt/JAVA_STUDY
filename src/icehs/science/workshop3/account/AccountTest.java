package icehs.science.workshop3.account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> 계좌를 생성합니다.");
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.println(">>> 20000원을 입금합니다.");
		acc.deposit(20000);
		
		System.out.println(">>> 이자를 지급합니다.");
		int calculate = 0; 
		calculate = acc.calculateInterest();
		System.out.println("이자 : " + calculate);
		acc.setBalance(acc.getBalance() + calculate);
		acc.printAccountInfo();
		
		System.out.println(">>> 150000원을 출금합니다.");
		acc.withdraw(150000);
		
		System.out.println(">>> 500000원을 출금합니다.");
		acc.withdraw(500000);
	}

}
