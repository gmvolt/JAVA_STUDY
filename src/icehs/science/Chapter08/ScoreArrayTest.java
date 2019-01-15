package icehs.science.Chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {93, 87, 90, 98};
		String[] sub = {"국어", "영어", "수학", "과학"};
		int sum = 0;
		double ave = 0;
		
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
			System.out.println(sub[i] + " : " + score[i]);
		}
		
		ave = (double)sum / score.length;
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + ave);
		
		/*System.out.println("국어 : " + score[0]);
		System.out.println("영어 : " + score[1]);
		System.out.println("수학 : " + score[2]);
		System.out.println("평균 : ");*/
		
		
	}

}
