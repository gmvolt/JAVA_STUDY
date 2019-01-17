package icehs.science.Chapter10;



public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] car = {
				new Taxi(),
				new Truck()
		};
		
		for(int i = 0 ; i < car.length ; i++) {
			car[i].setOilSize(10);
			car[i].go((i + 2) * 10);
		}
	}

}
