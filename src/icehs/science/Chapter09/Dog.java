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
		System.out.println("시속 40km로 뛰어");
	}
	@Override
	public void play() {
		System.out.println("순록을 잡아요");
	}
	
	public void printDogInfo() {
		System.out.println("이름 : " + this.name);
		super.printAnimalInfo();
	}
	
}
