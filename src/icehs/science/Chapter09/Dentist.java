package icehs.science.Chapter09;

public class Dentist extends Doctor{
	public Dentist(String name) {
		super(name,"치과");
	}
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void pullOutTooth() {
		System.out.println("이를 뽑습니다.");
	}
	
}
