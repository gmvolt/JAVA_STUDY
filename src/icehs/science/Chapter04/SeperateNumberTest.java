package icehs.science.Chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456;
		System.out.println("���� : " + num);
		
		System.out.println("���� �ڸ� �� : " + num / 100);
		num = num % 100;
		System.out.println("���� �ڸ� �� : " + num/10);
		num = num % 10;
		System.out.println("���� �ڸ� �� : " + num);
	}

}
