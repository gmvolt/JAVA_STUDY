package icehs.science.Chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1 ; i <= 500 ; i++) {
			sum += i;
		}
		System.out.println("ÇÕ°è : " + sum);
		double average = (double)sum / 500;
		System.out.println("Æò±Õ : " + average);
	}

}
