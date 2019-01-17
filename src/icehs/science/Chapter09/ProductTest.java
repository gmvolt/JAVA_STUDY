package icehs.science.Chapter09;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product laundry = new Product("통돌이", 450000, 8);
		Television tv = new Television("씨네마 TV", 3500000, 10, "화면크기가 151cm");
		
		laundry.printProductInfo();
		System.out.println("---------------------------------------------------------");
		tv.printProductInfo();
		System.out.println("비고 : " + tv.getDiscountRate());
		
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다.");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println(laundry.getName() + " 판매가 : " + laundry.calculateDiscountPrice());
		System.out.println(tv.getName() + " 판매가 : " + tv.calculateDiscountPrice());
	}

}
