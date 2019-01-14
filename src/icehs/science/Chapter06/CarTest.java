package icehs.science.Chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.oilAmount = 5;
		c1 .distance = 140.0;
		c1.printCarInfo();
		c1.addOil(10);
		c1.driveCar("IT센터", "인천공항", 10.17);
		c1.driveCar("인천공항", "곤지암리조트", 60.21);
		
		c1.ableDriveDistance();
	}
}
