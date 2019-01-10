package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mathScore = 94.7;
		double engScore = 83.2;
		double korScore = 87.1;
		
		int intmathScore = (int)mathScore;
		int intengScore = (int)engScore;
		int intkorScore = (int)korScore;
		
		System.out.println("수학 : " + intmathScore);
		System.out.println("영어 : " + intengScore);
		System.out.println("국어 : " + intkorScore);
		
		/*
		 *System.out.println("수학 : " + (int)mathScore);
		 *System.out.println("영어 : " + (int)engScore);
		 *System.out.println("국어 : " + (int)korScore);
		 */
	}

}
