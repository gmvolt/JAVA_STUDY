package icehs.science.Chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		
		while (sum < 100) {
			int num =i * 5;
			sum += num;
			
			System.out.println(i++ + ".( +" + num + " ) " + sum);
		}
		
	}

}
