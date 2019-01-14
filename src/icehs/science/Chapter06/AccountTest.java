package icehs.science.Chapter06;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.name = "ȫ�浿";
		acc.num = "123-456789";
		acc.balance = 10000;
		acc.printAccountInfo();
		acc.deposit(20000);
		acc.withdraw(45000);
		
		acc.deposit(-1000);
		acc.withdraw(-1000);
	}

}
