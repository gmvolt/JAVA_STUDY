package icehs.science.Chapter10.Car;

public class Car implements Washer{
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
	@Override
	public void wash() {
		// TODO Auto-generated method stub
		System.out.println("�����մϴ�");
	}
	
	
}
