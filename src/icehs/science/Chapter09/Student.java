package icehs.science.Chapter09;

public class Student extends Person{
	private String department;
	
	
	public Student() {
		super();
	}
	
	public Student(String name, String phoneNum, String department) {
		super(name,phoneNum);
		this.department = department;
	}
	public void study() {
		System.out.println("공부합니다.");
	}

	@Override
	public void eat() {
		super.eat();
		System.out.println("반별로 모여서 먹어요.");
	}
	
}
