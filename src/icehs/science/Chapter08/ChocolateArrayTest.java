package icehs.science.Chapter08;

public class ChocolateArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate [] choco = new Chocolate[3];
		choco[0] = new Chocolate("�Ƹ�����", "��ũ", 2200);
		choco[1] = new Chocolate("ī�� Ű����", "dark", 2500);
		choco[2] = new Chocolate("Ʈ���� ���", "ȭ��Ʈ", 2300);
		
		for (int i = 0 ; i <= 2 ; i++) {
			choco[i].printChocolateInfo();
		}
	}

}
