package icehs.science.Chapter09;

public class FundAccount extends Account{
	private double earningRate;
	
	
	
	public FundAccount() {
		super();
	}

	public FundAccount(String num, String name, int balance, double earningRate) {
		super(num, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("수익률 : " + this.earningRate + "%");
		System.out.println("수익이 발생하였습니다.");
	}
	
	public String toString() {
		return "수익률 : " + this.getEarningRate() + "원";
	}
	
	public void earnMoney() {
		System.out.println("수익률 : " + this.earningRate);
		System.out.println("수익이 발생하였습니다.");
	}
}
