package icehs.science.Chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOdd = 0;
		int sumEven = 0;
		for (int i = 1 ; i <= 1000 ; i++) {
			if (i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
		}
		int sum = sumOdd + sumEven;
		
		System.out.println("1부터 1000까지의 합 : " + sum);
		System.out.println("1부터 1000까지 짝수들의 합 : " + sumEven);
		System.out.println("1부터 1000까지 홀수들의 합 : " + sumOdd);
	}

}
