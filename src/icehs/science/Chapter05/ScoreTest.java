package icehs.science.Chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		double average = 0;
		
		System.out.print("반의 학생수는? ");
		int studentNo = scanner.nextInt();
		
		for (int i = 1 ; i <= studentNo ; i++) {
			System.out.print(i + "번 점수 : ");
			int score = scanner.nextInt();
			sum += score;
		}
		average =(double)sum / studentNo;
		System.out.println("===========================");
		System.out.println(studentNo + "명의 총점 : " + sum + "점");
		System.out.println(studentNo + "명의 평균 : " + average + "점");
		System.out.println("===========================");
	}

}
