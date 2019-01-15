package icehs.science.Chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		int sum = 0;
		for(int i = 0 ; i <= num.length-1 ; i++) {
			sum += num[i];
		}
		
		System.out.println("гу╟Х : " + sum);
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		int temp = num[0];
		num[0] = num[8];
		num[8] = num[0];
		
		for(int i = 0 ; i < num.length ; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
