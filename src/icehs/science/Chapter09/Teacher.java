package icehs.science.Chapter09;

public class Teacher extends Person{
	private String subject;
	
	
	
	public Teacher() {
		super();
	}

	public Teacher (String name, String phoneNum, String subject) {
		super(name, phoneNum);
		this.subject = subject;
	}
	
	public void teach() {
		System.out.println("�����մϴ�.");
	}
	@Override
	public void eat() {
		super.eat();
		System.out.println("ȥ���ؿ�.");
	}
}
