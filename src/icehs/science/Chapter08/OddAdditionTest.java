package icehs.science.Chapter08;

public class OddAdditionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = {10, 21, 33, 42, 51, 64, 79, 80};
		
		int sum = 0;
		for(int i = 0 ; i < num.length ; i++) {
			if(num[i] % 2 == 1) {
				sum += num[i];
			}
		}
		
		System.out.println("홀수들의 합계는 " + sum + "입니다.");
	}

}
