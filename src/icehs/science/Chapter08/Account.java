package icehs.science.Chapter08;

public class Account {
	private String name;
	private int balance;
	private double interstRate;
	public Account(String name, int balance, double interstRate) {
		super();
		this.name = name;
		this.balance = balance;
		this.interstRate = interstRate;
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
	public double getInterstRate() {
		return interstRate;
	}
	public void setInterstRate(double interstRate) {
		this.interstRate = interstRate;
	}
	
	public int getCalculateInterst() {
		return (int)(this.balance * this.interstRate / 100);
	}
	
}
