package icehs.science.Chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pay = 1000000;
		int yearpay = pay * 12;
		int taxyearpay = yearpay * 9 / 10;
		System.out.println("���� : " + yearpay + ", ���� ���� : " + taxyearpay);
		
		int bonus = pay * 1 / 5 * 4;
		int taxbonus = bonus * 189 / 200;
		System.out.println("���ʽ� : " + bonus + ", ���� ���ʽ� : " + taxbonus);
		
		System.out.println("���޾� : " + (taxyearpay + taxbonus));
	}

}
