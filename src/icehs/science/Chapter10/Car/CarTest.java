package icehs.science.Chapter10.Car;



public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] car = {
				new Taxi(),
				new Truck()
		};

		car[0].wash();
		System.out.print("�ý� : ");
		car[0].wash();
		System.out.print("Ʈ�� : ");
		car[1].wash();
		
		
	}

}
