package icehs.science.Chapter05;

import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.println("���� ���ڸ� �Է��ϼ���. 0�� �Է��ϸ� ������");
			int num = scanner.nextInt();
			if (num == 0) {
				break;
			}else {
				sum += num;
			}
		}
		System.out.println("�հ� : " + sum);
	}

}
