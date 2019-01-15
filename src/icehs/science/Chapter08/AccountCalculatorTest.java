package icehs.science.Chapter08;

public class AccountCalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account [] acc = {
				new Account("111-2222-5550", 10000, 4.5),
				new Account("111-2222-5551", 20000, 4.5),
				new Account("111-2222-5552", 30000, 4.5),
				new Account("111-2222-5553", 40000, 4.5),
				new Account("111-2222-5554", 50000, 4.5)
		};
		
		for(int i = 0 ; i < acc.length ; i++) {
			System.out.println("계좌번호 : " + acc[i].getName() + 
					           " / 잔액 : " + acc[i].getBalance() + 
					           " / 이율 : " + ( acc[i].getInterstRate() + acc[i].getCalculateInterst()));
		}
		
		System.out.println("이율을 변경합니다.");
		
		for(int i = 0 ; i < acc.length ; i++) {
			acc[i].setInterstRate(3.7);
		}
		
		for(int i = 0 ; i < acc.length ; i++) {
			System.out.println("계좌번호 : " + acc[i].getName() + 
					           " / 잔액 : " + acc[i].getBalance() + 
					           " / 이율 : " + ( acc[i].getInterstRate() + acc[i].getCalculateInterst()));
		}
	}
}
