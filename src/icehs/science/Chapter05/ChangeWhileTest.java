package icehs.science.Chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *		for(int i = 1 ; i <= 10 ; i++) {
 *			for(int j = 1 ; j <= i ; j++) {
 *				System.out.print("*");
 *			}
 *			System.out.println();
 *		}
 */		
		int i = 1;
		while(i <= 10) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}

}
