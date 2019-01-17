package icehs.science.Chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.setName("具克捞");
		cat.setAge(3);
		cat.setKind("其福矫救");
		Dog dog = new Dog(2,"矫海府救 倾胶虐", "港港捞");
		cat.printCatInfo();
		cat.run();
		cat.hunt();
		cat.play();
		
		System.out.println();
		
		dog.printAnimalInfo();
		dog.run();
		dog.hunt();
		dog.play();
	}

}
