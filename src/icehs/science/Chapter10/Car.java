package icehs.science.Chapter10;

public class Car {
	private int oilSize;
	public void go ( int distance) {
		System.out.println(distance + " km �̵��մϵ�.");
		System.out.println("���� : " + oilSize);
	}
	public int getOilSize() {
		return oilSize;
	}
	public void setOilSize(int oilSize) {
		this.oilSize = oilSize;
	}
	
	
}
