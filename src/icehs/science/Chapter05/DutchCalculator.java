package icehs.science.Chapter05;

import java.util.Scanner;

public class DutchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("������ �� ���� ����ǳ���? : ");
		int meeting = scanner.nextInt();
		
		System.out.println("========================");
		System.out.println("�� �������� �� ����� �Է��ϼ���");
		for(int i = 1 ; i <= meeting ; i++) {
			System.out.print(i + "�� ��� : ");
			int money = scanner.nextInt();
			sum += money;
		}
		System.out.println("�� ����� " + sum + "�� �Դϴ�.");
		System.out.println("========================");
		System.out.print("������ �ο����� �Է��ϼ���. : ");
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
