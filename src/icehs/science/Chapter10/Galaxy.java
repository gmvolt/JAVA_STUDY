package icehs.science.Chapter10;

public class Galaxy extends Mobile{
	private String osVer;

	
	
	public String getOsVer() {
		return osVer;
	}



	public void setOsVer(String osVer) {
		this.osVer = osVer;
	}



	public void charge(int time) {
		System.out.println(super.getProduction() + "보조 베터리 " + time + "분 충전");
	}
	
}
