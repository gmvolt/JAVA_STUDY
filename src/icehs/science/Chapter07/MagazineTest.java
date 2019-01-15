package icehs.science.Chapter07;

public class MagazineTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magazine mag = new Magazine();
		//mag.price = 2000; 오류 발생
		mag.setPrice(2000);
		int discountPrice = mag.discountPrice(10);
	}
}
