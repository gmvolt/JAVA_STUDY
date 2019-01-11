package icehs.science.Chapter05;

public class SwapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4;
		int num2 = 5;
		
		System.out.println("자리순서 : " + num1 + "," + num2);
		int temp=0;
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("자리순서 : " + num1 + "," + num2);
		
	}

}
