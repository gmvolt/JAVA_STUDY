package icehs.science.chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lotto = 0.0000001235;
		int intlotto = (int)lotto;
		long population = 6973738433L;
		int intpopulation = (int)population;
		
		System.out.println("�ζǿ� ��÷�� Ȯ�� : " + lotto);
		System.out.println("�ζǿ� ��÷�� Ȯ�� int ��ȯ : " + intlotto);
		System.out.println("�� ������ �α� �� : " + population);
		System.out.println("�� ������ �α� �� int ��ȯ: " + intpopulation);
		
	}

}
