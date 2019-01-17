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
		System.out.println("���¸� �����մϴ�.");
		
	}
	
	public String toString() {
		String str ="���� ��ȣ : " + this.num + "\n" ;
		str += "������ : " + this.name + "\n"; 
		str += "�ܾ� : " + this.balance + "\n";
		return str;
	}
}
