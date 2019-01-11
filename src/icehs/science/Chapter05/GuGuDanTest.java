package icehs.science.Chapter05;

public class GuGuDanTest {
	public static void main(String[] args) {
		for (int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.print(i + " * " + j + " = " + i * j);
				if(j != 9) {
					System.out.print("\t ");
				}
			}
			System.out.println();
		}
	}
}
