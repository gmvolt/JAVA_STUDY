package icehs.science.Chapter09;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FundAccount fund = new FundAccount();
		fund.setNum("111-2222");
		fund.setName("ȫ�浿");
		fund.setBalance(500000);
		fund.setEarningRate(4.7);
		fund.openAccount();
		fund.earnMoney();
	}

}
