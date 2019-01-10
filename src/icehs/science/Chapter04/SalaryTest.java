package icehs.science.Chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pay = 1000000;
		int yearpay = pay * 12;
		int taxyearpay = yearpay * 9 / 10;
		System.out.println("연봉 : " + yearpay + ", 세후 연봉 : " + taxyearpay);
		
		int bonus = pay * 1 / 5 * 4;
		int taxbonus = bonus * 189 / 200;
		System.out.println("보너스 : " + bonus + ", 세후 보너스 : " + taxbonus);
		
		System.out.println("지급액 : " + (taxyearpay + taxbonus));
	}

}
