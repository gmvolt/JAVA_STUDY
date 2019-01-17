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
		System.out.println("���ͷ� : " + this.earningRate + "%");
		System.out.println("������ �߻��Ͽ����ϴ�.");
	}
	
	public String toString() {
		return "���ͷ� : " + this.getEarningRate() + "��";
	}
	
	public void earnMoney() {
		System.out.println("���ͷ� : " + this.earningRate);
		System.out.println("������ �߻��Ͽ����ϴ�.");
	}
}
