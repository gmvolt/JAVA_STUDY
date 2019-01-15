package icehs.science.Chapter06;

public class Chocolate {

	String name;
	String type;
	int price;
	
	String getName() {
		return name;
	}
	
	int calculateTotalPrice(int count) {
		return count * price;
	}

	int calculateTotalPrice(int cnt, int discount) {
		int resultPrice = price * (100 - discount) / 100 * cnt;
		return resultPrice;
	}

	
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
		printChocolateInfo();
	}
	
	void changeChocolateInfo(String newName, String newType, int newPrice) {
		name = newName;
		type = newType;
		price = newPrice;
	}
	
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " + type + ", 가격 : " + price);
	}
}