package icehs.science.Chapter08;

public class ScoreArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] score = {93, 87, 90, 98};
		String[] sub = {"����", "����", "����", "����"};
		int sum = 0;
		double ave = 0;
		
		for(int i = 0 ; i < score.length ; i++) {
			sum += score[i];
			System.out.println(sub[i] + " : " + score[i]);
		}
		
		ave = (double)sum / score.length;
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + ave);
		
		/*System.out.println("���� : " + score[0]);
		System.out.println("���� : " + score[1]);
		System.out.println("���� : " + score[2]);
		System.out.println("��� : ");*/
		
		
	}

}
