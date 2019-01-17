package icehs.science.Chapter09;

public class Person {
	private String name;
	private String phoneNum;
	
	
	
	public Person(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}

	public Person() {
	}

	public void eat() {
		System.out.println("밥을 먹어요.");
	}
	
	public void sleep() {
		System.out.println("잠을 자요");
	}
	
	
}
