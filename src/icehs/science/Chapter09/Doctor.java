package icehs.science.Chapter09;

public class Doctor {
	private String name;
	protected String department;
	
	
	public Doctor(String name, String department) {
		this.name = name;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void treatPatirnt() {
		System.out.println("ȯ�ڸ� �����մϴ�.");
	}
	
}
