package icehs.science.Chapter03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lotto = 0.0000001235;
		int intlotto = (int)lotto;
		long population = 6973738433L;
		int intpopulation = (int)population;
		
		System.out.println("로또에 당첨될 확률 : " + lotto);
		System.out.println("로또에 당첨될 확률 int 변환 : " + intlotto);
		System.out.println("전 세계의 인구 수 : " + population);
		System.out.println("전 세계의 인구 수 int 변환: " + intpopulation);
		
	}

}
