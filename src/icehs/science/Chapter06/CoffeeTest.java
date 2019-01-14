package icehs.science.Chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee americano = new Coffee();
		Coffee cafelatte = new Coffee();
		Coffee makiatto = new Coffee();
		
		americano.name = "아메리카노";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		cafelatte.name = "카페라테";
		cafelatte.price = 4000;
		cafelatte.printCoffeeInfo();
		
		makiatto.name = "마키아또";
		makiatto.price = 4500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = americano.price + cafelatte.price + makiatto.price;
		System.out.println("총 금액 : " + totalPrice + "원");
	}

}
