package icehs.science.Chapter06;

public class Car {
	int oilAmount;
	double distance;
	void addOil(int amount) {
		System.out.println("휘발유 : " + amount + "L 주유합니다.");
		oilAmount +=amount;
		printCarInfo();
	}
	
	void driveCar(String start, String end, double dist) {
		
		
		oilAmount = (int)(oilAmount - (dist / 20));
		distance += dist;
		System.out.println(start + "에서 " + end + "까지" + dist + "km 주행하였습니다.");
		printCarInfo();
		
		
	}
	
	void printCarInfo() {
		System.out.println("[ICE 카~] 남은 기름양 : " + oilAmount + "L, 총 주행거리 : " + distance + "km");
		
	}
	
	void ableDriveDistance() {
		System.out.println("주행 가능한 거리는 약 " + (oilAmount * 20) + "km 입니다.");
		
	}
}
