package icehs.science.Chapter09;

public class Animal {
	private int age;
	private String kind;
	
	public Animal() {
		super();
	}

	public Animal(int age, String kind) {
		super();
		this.age = age;
		this.kind = kind;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void run() {
		System.out.println("�޷���");
	}
	
	public void printAnimalInfo() {
		System.out.println("���� : " + this.age);
		System.out.println("���� : " + this.kind);
	}

	public void hunt() {
		// TODO Auto-generated method stub
		
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}
}
