package icehs.science.Chapter09;

public class Dog extends Animal{

	private String name;

	public Dog() {
		super();

	}

	public Dog(int age, String kind, String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void hunt() {
		System.out.println("�ü� 40km�� �پ�");
	}
	@Override
	public void play() {
		System.out.println("������ ��ƿ�");
	}
	
	public void printDogInfo() {
		System.out.println("�̸� : " + this.name);
		super.printAnimalInfo();
	}
	
}
