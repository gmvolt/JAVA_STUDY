package icehs.science.workshop3.account;

public class Account {
	private String account;
	private int balance;
	private double interestRate;
	public Account() {
	}
	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
		printAccountInfo();
	}
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public int calculateInterest() {
		return (int)(this.balance * this.interestRate / 100);
	}
	public void deposit(int money) {
		this.balance += money;
		printAccountInfo();
	}
	public void withdraw(int money) {
		if(money < this.balance) {
			this.balance -= money;
		}else {
			System.out.println("[����] �ܾ��� �����մϴ�.");
		}
		printAccountInfo();
	}
	public void printAccountInfo() {
		System.out.println("���� ���� : " + this.account + 
						   ", �ܾ� : " + this.balance + 
						   ", ������ : " + this.interestRate + "%");
		System.out.println();
	}
	
}
