package icehs.science.Chapter05;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		do {
			System.out.print("점수를 입력하세요. : ");
			score = scanner.nextInt();
		}while(score < 0 || score > 100);
		
		System.out.println(score);
	}

}
