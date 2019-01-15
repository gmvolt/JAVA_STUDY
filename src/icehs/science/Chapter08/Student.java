package icehs.science.Chapter08;

public class Student {
	private String name;
	private String Id;
	private String phoneNum;
	
	public Student(String name, String id, String phoneNum) {
		super();
		this.name = name;
		Id = id;
		this.phoneNum = phoneNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public void printStudentInfo() {
		System.out.println(this.name + " ( " + this.Id + " ) / 전화번호 : " + this.phoneNum);
	}
	
}
