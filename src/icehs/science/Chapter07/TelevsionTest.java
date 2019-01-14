package icehs.science.Chapter07;

public class TelevsionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television infinia = new Television("INFINIA", 1500000);
		Television xcanvas = new Television("XCANVAS", 1000000, "LCD TV");
		Television cinema = new Television("CINEMA", 2000000, "3D TV");
		
		infinia.printTelevisionInfo();
		xcanvas.printTelevisionInfo();
		cinema.printTelevisionInfo();
		
		int total = infinia.price + xcanvas.price + cinema.price;
		
		System.out.println("가격의 합 : " + total);
	}

}
