package icehs.science.Chapter07;

public class PublicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication pub1 = new Publication();
		pub1.setTitle("만화삼국지");
		pub1.setPage(300);
		pub1.setPrice(5000);
		
		System.out.println("===== 출판물 정보를 세팅합니다. =====");
		pub1.setPage(-1000);
		pub1.setPrice(-5000);
		pub1.printPublicationInfo();
		System.out.println("출판물 정보 : " + 
							pub1.getTitle() + 
							" ( " + pub1.getPrice() + 
							"원, " + pub1.getPage() + 
							"page )");
	}

}
