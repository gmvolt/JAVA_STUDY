package icehs.science.Chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {12, 53, 24, 10, 22, 38, 64, 39};
		
		int max = num[0]; 
		int min = num[0];
		

		
		for(int i = 0 ; i < num.length ; i++) {
			
			if(max < num[i]) {
				max = num[i];
			}
			if(min > num[i]) {
				min = num[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
