package icehs.science.Chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("모임이 몇 차로 진행되나요? : ");
		int meeting = scanner.nextInt();
		
		System.out.println("========================");
		System.out.println("각 차수에서 쓴 비용을 입력하세요");
		for(int i = 1 ; i <= meeting ; i++) {
			System.out.print(i + "차 비용 : ");
			int money = scanner.nextInt();
			sum += money;
		}
		System.out.println("총 비용은 " + sum + "원 입니다.");
		System.out.println("========================");
		System.out.print("모임의 인원수를 입력하세요. : ");
		int member = scanner.nextInt();
		System.out.println("========================");
		int dutch = sum / member;
		for(int i = 1 ; i <= member ; i++) {
			if(i != member) {
				System.out.println(i + " :" + dutch);
			}else {
				System.out.println(i + " :" + (dutch + sum % member));
			}
		}
	}

}
