package icehs.science.Chapter09;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.setName("�߿���");
		cat.setAge(3);
		cat.setKind("�丣�þ�");
		Dog dog = new Dog(2,"�ú����� �㽺Ű", "�۸���");
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
