package icehs.science.Chapter09;

public class Account {
	private String num;
	private String name;
	private int balance;
	
	
	public Account() {
		
	}
	public Account(String num, String name, int balance) {
		this.num = num;
		this.name = name;
		this.balance = balance;
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void openAccount() {
		System.out.println("계좌를 개설합니다.");
		
	}
	
	public String toString() {
		String str ="계좌 번호 : " + this.num + "\n" ;
		str += "예금주 : " + this.name + "\n"; 
		str += "잔액 : " + this.balance + "\n";
		return str;
	}
}
