package icehs.science.Chapter06;

public class Car {
	int oilAmount;
	double distance;
	void addOil(int amount) {
		System.out.println("�ֹ��� : " + amount + "L �����մϴ�.");
		oilAmount +=amount;
		printCarInfo();
	}
	
	void driveCar(String start, String end, double dist) {
		
		
		oilAmount = (int)(oilAmount - (dist / 20));
		distance += dist;
		System.out.println(start + "���� " + end + "����" + dist + "km �����Ͽ����ϴ�.");
		printCarInfo();
		
		
	}
	
	void printCarInfo() {
		System.out.println("[ICE ī~] ���� �⸧�� : " + oilAmount + "L, �� ����Ÿ� : " + distance + "km");
		
	}
	
	void ableDriveDistance() {
		System.out.println("���� ������ �Ÿ��� �� " + (oilAmount * 20) + "km �Դϴ�.");
		
	}
}
