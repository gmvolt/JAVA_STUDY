package icehs.science.Chapter09;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product laundry = new Product("�뵹��", 450000, 8);
		Television tv = new Television("���׸� TV", 3500000, 10, "ȭ��ũ�Ⱑ 151cm");
		
		laundry.printProductInfo();
		System.out.println("---------------------------------------------------------");
		tv.printProductInfo();
		System.out.println("��� : " + tv.getDiscountRate());
		
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		laundry.setDiscountRate(15);
		tv.setDiscountRate(15);
		
		System.out.println(laundry.getName() + " �ǸŰ� : " + laundry.calculateDiscountPrice());
		System.out.println(tv.getName() + " �ǸŰ� : " + tv.calculateDiscountPrice());
	}

}
