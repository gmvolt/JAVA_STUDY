package icehs.science.Chapter10;

public class Galaxy extends Mobile implements Gooplay{
	private String osVer;

	
	
	public String getOsVer() {
		return osVer;
	}



	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}



	public void charge(int time) {
		System.out.println(super.getProduction() + "���� ���͸� " + time + "�� ����");
	}



	@Override
	public void buy(String kind, int price) {
		// TODO Auto-generated method stub
		System.out.println("Galaxy : " + kind + " ���� " + price + "���� �����߽��ϴ�.");
		
	}
	
}
