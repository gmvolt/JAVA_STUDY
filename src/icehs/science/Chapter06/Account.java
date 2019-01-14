package icehs.science.Chapter06;

public class Account {
	String name;
	String num;
	int balance;
		
	public void deposit (int money) {
		System.out.println(money + "�� �Ա��մϴ�.");
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
			balance += money;
			printBalance();
		}
	}
	
	public int withdraw (int money) {
		System.out.println(money + "�� ����մϴ�.");
		if (money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
			return 0;
		}else if(money > balance) {
			System.out.println("[����] �ܾ��� �����մϴ�.");
			return 0;
		}else {
			balance -= money;
			printBalance();
			return money;
		}
		
	}
	
	void printAccountInfo() {
		System.out.println("���� : " + num + "( ������ : " + name + " )");
		
	}
	
	void printBalance() {
		System.out.println("�ܾ� : " + balance + "��");
	}
	
}
