package icehs.science.Chapter07;

public class PublicationTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publication.printHeader();
		
		Publication sam = new Publication();
		Publication pi = new Publication();
		
		sam.setTitle("��ȭ �ﱹ��");
		sam.setPage(300);
		sam.setPrice(5000);
		sam.printPublicationInfo();
		
		pi.setTitle("���� �̾߱�");
		pi.setPrice(8400);
		pi.setPage(280);
		pi.printPublicationInfo();
	
	}

}
