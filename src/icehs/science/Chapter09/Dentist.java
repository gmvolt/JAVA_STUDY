package icehs.science.Chapter09;

public class Dentist extends Doctor{
	public Dentist(String name) {
		super(name,"ġ��");
	}
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void pullOutTooth() {
		System.out.println("�̸� �̽��ϴ�.");
	}
	
}
