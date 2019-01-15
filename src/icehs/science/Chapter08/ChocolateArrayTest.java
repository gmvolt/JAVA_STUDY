package icehs.science.Chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate [] choco = new Chocolate[3];
		choco[0] = new Chocolate("아마도라", "다크", 2200);
		choco[1] = new Chocolate("카페 키리쉬", "dark", 2500);
		choco[2] = new Chocolate("트리플 블랑", "화이트", 2300);
		
		for (int i = 0 ; i <= 2 ; i++) {
			choco[i].printChocolateInfo();
		}
	}

}
