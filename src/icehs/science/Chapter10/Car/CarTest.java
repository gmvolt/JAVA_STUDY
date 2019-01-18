package icehs.science.Chapter10.Car;



public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] car = {
				new Taxi(),
				new Truck()
		};

		car[0].wash();
		System.out.print("택시 : ");
		car[0].wash();
		System.out.print("트럭 : ");
		car[1].wash();
		
		
	}

}
