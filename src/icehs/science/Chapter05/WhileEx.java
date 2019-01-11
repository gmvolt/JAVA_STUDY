package icehs.science.Chapter05;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i = 1;
		
		while(sum < 10) {
			sum += i;
			//i++;
			System.out.println(i++ + " : " + sum);
		}
	}

}
