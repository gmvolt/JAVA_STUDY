package icehs.science.Chapter06;

public class Account {
	String name;
	String num;
	int balance;
		
	public void deposit (int money) {
		System.out.println(money + "원 입금합니다.");
		if (money < 0) {
			System.out.println("[에러] 금액을 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
			printBalance();
		}
	}
	
	public int withdraw (int money) {
		System.out.println(money + "원 출금합니다.");
		if (money < 0) {
			System.out.println("[에러] 금액을 음수를 입력할 수 없습니다.");
			return 0;
		}else if(money > balance) {
			System.out.println("[에러] 잔액이 부족합니다.");
			return 0;
		}else {
			balance -= money;
			printBalance();
			return money;
		}
		
	}
	
	void printAccountInfo() {
		System.out.println("계좌 : " + num + "( 예금주 : " + name + " )");
		
	}
	
	void printBalance() {
		System.out.println("잔액 : " + balance + "원");
	}
	
}
