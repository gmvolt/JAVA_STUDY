package icehs.science.workshop3.account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(">>> ���¸� �����մϴ�.");
		Account acc = new Account("441-0290-1203", 500000, 7.3);
		
		System.out.println(">>> 20000���� �Ա��մϴ�.");
		acc.deposit(20000);
		
		System.out.println(">>> ���ڸ� �����մϴ�.");
		int calculate = 0; 
		calculate = acc.calculateInterest();
		System.out.println("���� : " + calculate);
		acc.setBalance(acc.getBalance() + calculate);
		acc.printAccountInfo();
		
		System.out.println(">>> 150000���� ����մϴ�.");
		acc.withdraw(150000);
		
		System.out.println(">>> 500000���� ����մϴ�.");
		acc.withdraw(500000);
	}

}
