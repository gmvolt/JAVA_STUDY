package icehs.science.Chapter09;

public class Account {
	private String num;
	private String name;
	private int balance;
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
		System.out.println("���� ��ȣ : " + this.num);
		System.out.println("������ : " + this.name);
		System.out.println("�ܾ� : " + this.balance);
	}
}
